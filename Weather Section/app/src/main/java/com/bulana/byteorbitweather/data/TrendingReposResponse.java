package com.bulana.byteorbitweather.data;

import com.google.auto.value.AutoValue;
import com.bulana.byteorbitweather.model.Repo;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

import com.bulana.byteorbitweather.data.AutoValue_TrendingReposResponse;

@AutoValue
public abstract class TrendingReposResponse {

    @Json(name = "items")
    public abstract List<Repo> repos();

    public static JsonAdapter<TrendingReposResponse> jsonAdapter(Moshi moshi) {
        return new AutoValue_TrendingReposResponse.MoshiJsonAdapter(moshi);
    }
}
