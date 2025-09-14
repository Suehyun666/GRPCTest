package com.example.hts;

import io.grpc.stub.StreamObserver;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MarketDataServiceImpl extends MarketDataServiceGrpc.MarketDataServiceImplBase {

    private final Random random = new Random();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);

    @Override
    public void getPrice(Hts.PriceRequest request, StreamObserver<Hts.PriceResponse> responseObserver) {
        Hts.PriceResponse response = Hts.PriceResponse.newBuilder()
                .setSymbol(request.getSymbol())
                .setPrice(random.nextDouble() * 10000 + 50000) // 50000-60000 range
                .setVolume(random.nextInt(900) + 100) // 100-1000 range
                .setTimestamp(System.currentTimeMillis())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void subscribeRealtime(Hts.SubscribeRequest request, StreamObserver<Hts.TickData> responseObserver) {
        scheduler.scheduleAtFixedRate(() -> {
            try {
                for (String symbol : request.getSymbolsList()) {
                    Hts.TickData tickData = Hts.TickData.newBuilder()
                            .setSymbol(symbol)
                            .setPrice(random.nextDouble() * 10000 + 50000) // 50000-60000 range
                            .setVolume(random.nextInt(900) + 100) // 100-1000 range
                            .setTimestamp(System.currentTimeMillis())
                            .build();

                    responseObserver.onNext(tickData);
                }
            } catch (Exception e) {
                responseObserver.onError(e);
            }
        }, 0, 100, TimeUnit.MILLISECONDS); // 100ms interval
    }
}