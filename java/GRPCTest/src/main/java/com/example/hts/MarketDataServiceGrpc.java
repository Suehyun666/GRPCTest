package com.example.hts;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: hts.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MarketDataServiceGrpc {

  private MarketDataServiceGrpc() {}

  public static final String SERVICE_NAME = "MarketDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Hts.PriceRequest,
      Hts.PriceResponse> getGetPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrice",
      requestType = Hts.PriceRequest.class,
      responseType = Hts.PriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Hts.PriceRequest,
      Hts.PriceResponse> getGetPriceMethod() {
    io.grpc.MethodDescriptor<Hts.PriceRequest, Hts.PriceResponse> getGetPriceMethod;
    if ((getGetPriceMethod = MarketDataServiceGrpc.getGetPriceMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getGetPriceMethod = MarketDataServiceGrpc.getGetPriceMethod) == null) {
          MarketDataServiceGrpc.getGetPriceMethod = getGetPriceMethod =
              io.grpc.MethodDescriptor.<Hts.PriceRequest, Hts.PriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hts.PriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hts.PriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("GetPrice"))
              .build();
        }
      }
    }
    return getGetPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Hts.SubscribeRequest,
      Hts.TickData> getSubscribeRealtimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeRealtime",
      requestType = Hts.SubscribeRequest.class,
      responseType = Hts.TickData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Hts.SubscribeRequest,
      Hts.TickData> getSubscribeRealtimeMethod() {
    io.grpc.MethodDescriptor<Hts.SubscribeRequest, Hts.TickData> getSubscribeRealtimeMethod;
    if ((getSubscribeRealtimeMethod = MarketDataServiceGrpc.getSubscribeRealtimeMethod) == null) {
      synchronized (MarketDataServiceGrpc.class) {
        if ((getSubscribeRealtimeMethod = MarketDataServiceGrpc.getSubscribeRealtimeMethod) == null) {
          MarketDataServiceGrpc.getSubscribeRealtimeMethod = getSubscribeRealtimeMethod =
              io.grpc.MethodDescriptor.<Hts.SubscribeRequest, Hts.TickData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeRealtime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hts.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hts.TickData.getDefaultInstance()))
              .setSchemaDescriptor(new MarketDataServiceMethodDescriptorSupplier("SubscribeRealtime"))
              .build();
        }
      }
    }
    return getSubscribeRealtimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MarketDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceStub>() {
        @Override
        public MarketDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MarketDataServiceStub(channel, callOptions);
        }
      };
    return MarketDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MarketDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceBlockingStub>() {
        @Override
        public MarketDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MarketDataServiceBlockingStub(channel, callOptions);
        }
      };
    return MarketDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MarketDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MarketDataServiceFutureStub>() {
        @Override
        public MarketDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MarketDataServiceFutureStub(channel, callOptions);
        }
      };
    return MarketDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPrice(Hts.PriceRequest request,
                          io.grpc.stub.StreamObserver<Hts.PriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPriceMethod(), responseObserver);
    }

    /**
     */
    default void subscribeRealtime(Hts.SubscribeRequest request,
                                   io.grpc.stub.StreamObserver<Hts.TickData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeRealtimeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MarketDataService.
   */
  public static abstract class MarketDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return MarketDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MarketDataService.
   */
  public static final class MarketDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MarketDataServiceStub> {
    private MarketDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MarketDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MarketDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPrice(Hts.PriceRequest request,
                         io.grpc.stub.StreamObserver<Hts.PriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeRealtime(Hts.SubscribeRequest request,
                                  io.grpc.stub.StreamObserver<Hts.TickData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeRealtimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MarketDataService.
   */
  public static final class MarketDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MarketDataServiceBlockingStub> {
    private MarketDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MarketDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MarketDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Hts.PriceResponse getPrice(Hts.PriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Hts.TickData> subscribeRealtime(
        Hts.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeRealtimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MarketDataService.
   */
  public static final class MarketDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MarketDataServiceFutureStub> {
    private MarketDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MarketDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MarketDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Hts.PriceResponse> getPrice(
        Hts.PriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRICE = 0;
  private static final int METHODID_SUBSCRIBE_REALTIME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRICE:
          serviceImpl.getPrice((Hts.PriceRequest) request,
              (io.grpc.stub.StreamObserver<Hts.PriceResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_REALTIME:
          serviceImpl.subscribeRealtime((Hts.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<Hts.TickData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Hts.PriceRequest,
              Hts.PriceResponse>(
                service, METHODID_GET_PRICE)))
        .addMethod(
          getSubscribeRealtimeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              Hts.SubscribeRequest,
              Hts.TickData>(
                service, METHODID_SUBSCRIBE_REALTIME)))
        .build();
  }

  private static abstract class MarketDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MarketDataServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Hts.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MarketDataService");
    }
  }

  private static final class MarketDataServiceFileDescriptorSupplier
      extends MarketDataServiceBaseDescriptorSupplier {
    MarketDataServiceFileDescriptorSupplier() {}
  }

  private static final class MarketDataServiceMethodDescriptorSupplier
      extends MarketDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MarketDataServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MarketDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MarketDataServiceFileDescriptorSupplier())
              .addMethod(getGetPriceMethod())
              .addMethod(getSubscribeRealtimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
