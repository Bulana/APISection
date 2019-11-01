package com.bulana.byteorbitweather.home;

import com.bluelinelabs.conductor.Controller;
import com.bulana.byteorbitweather.trending.TrendingReposComponent;
import com.bulana.byteorbitweather.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import com.bulana.byteorbitweather.di.ControllerKey;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
