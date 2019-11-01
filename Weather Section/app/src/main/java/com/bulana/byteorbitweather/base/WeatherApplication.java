package com.bulana.byteorbitweather.base;

import android.app.Application;

import javax.inject.Inject;

import com.bulana.byteorbitweather.BuildConfig;
import com.bulana.byteorbitweather.base.DaggerApplicationComponent;

import com.bulana.byteorbitweather.di.ActivityInjector;
import timber.log.Timber;

public class WeatherApplication extends Application {

    @Inject ActivityInjector activityInjector;

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
