package main

import (
	"context"
	"fmt"
	"github.com/golang-jwt/jwt"
	"log"
	"net"

	pb "awesomeProject/proto"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

// server는 awesomeProject.AuthServiceServer 인터페이스를 구현하는 구조체입니다.
type server struct {
	pb.UnimplementedAuthServiceServer
}

// Login은 awesomeProject.AuthServiceServer.Login을 구현합니다.
func (s *server) Login(ctx context.Context, in *pb.LoginRequest) (*pb.LoginResponse, error) {
	log.Printf("사용자 로그인 요청을 받음: %v", in.GetUserId())

	// 실제로는 여기에 인증 로직을 구현합니다.
	// 1. 사용자 자격 증명을 검증합니다 (예: 데이터베이스 확인).
	// 2. 자격 증명이 유효하면 JWT를 생성합니다.
	// 3. 응답에 JWT를 포함하여 반환합니다.

	if in.GetUserId() == "user123" && in.GetPassword() == "password123" {
		// 실제 앱에서는 진짜 JWT 토큰을 생성합니다.
		jwtToken := "샘플-jwt-토큰"
		refreshToken := "샘플-리프레시-토큰"
		return &pb.LoginResponse{JwtToken: jwtToken, RefreshToken: refreshToken}, nil
	}

	// 자격 증명이 유효하지 않으면 에러를 반환합니다.
	return nil, status.Error(codes.Unauthenticated, "유효하지 않은 사용자 ID 또는 비밀번호")
}

func main() {
	listenPort := ":50051"
	lis, err := net.Listen("tcp", listenPort)
	if err != nil {
		log.Fatalf("포트 리스닝 실패: %v", err)
	}

	s := grpc.NewServer()
	pb.RegisterAuthServiceServer(s, &server{})
	log.Printf("서버가 %v 포트에서 대기 중입니다", lis.Addr())

	if err := s.Serve(lis); err != nil {
		log.Fatalf("서버 실행 실패: %v", err)
	}
}
