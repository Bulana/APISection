package com.bulana.byteorbitweather.trending;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import com.bulana.byteorbitweather.di.ScreenScope;

@ScreenScope
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingReposController> {

    }
}
