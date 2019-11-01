package com.bulana.byteorbitweather.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import com.bulana.byteorbitweather.di.ActivityScope;
import com.bulana.byteorbitweather.ui.NavigationModule;

@ActivityScope
@Subcomponent(modules = {
        MainScreenBindingModule.class,
        NavigationModule.class,
})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

        @Override
        public void seedInstance(MainActivity instance) {

        }
    }
}
