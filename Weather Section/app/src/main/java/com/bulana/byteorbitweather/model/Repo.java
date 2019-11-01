package com.bulana.byteorbitweather.model;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import org.threeten.bp.ZonedDateTime;

import com.bulana.byteorbitweather.model.AutoValue_Repo;

@AutoValue
public abstract class Repo {

    public abstract long id();

    public abstract String time();

    public abstract String icon();

    public abstract String summary();

    public abstract String temperature();

    public static JsonAdapter<Repo> jsonAdapter(Moshi moshi) {
        return new AutoValue_Repo.MoshiJsonAdapter(moshi);
    }
}
