package com.bulana.byteorbitweather.networking;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Call;
import okhttp3.OkHttpClient;

@Module
public abstract class NetworkModule {

    @Provides
    @Singleton
    static Call.Factory provideOkHttp() {
        return new OkHttpClient.Builder().build();
    }

    @Provides
    @Named("base_url")
    static String provideBaseUrl() {
        return "https://api.darksky.net/";
    }
}


//https://api.darksky.net/forecast/dc9654f68c6db7dc4b75a31977cb0475/-33.918861,18.423300