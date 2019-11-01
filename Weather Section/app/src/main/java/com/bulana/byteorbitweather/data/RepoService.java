package com.bulana.byteorbitweather.data;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface RepoService {

    @GET("forecast/dc9654f68c6db7dc4b75a31977cb0475/-33.918861,18.423300")
    Single<TrendingReposResponse> getTrendingRepos();
}



//https://api.darksky.net/forecast/dc9654f68c6db7dc4b75a31977cb0475/-33.918861,18.423300