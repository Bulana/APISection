package com.bulana.byteorbitweather.base;

import com.bulana.byteorbitweather.data.RepoServiceModule;
import com.bulana.byteorbitweather.networking.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class,
})
public interface ApplicationComponent {

    void inject(WeatherApplication weatherApplication);
}
