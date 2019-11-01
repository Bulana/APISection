package com.bulana.byteorbitweather.home;

import com.bluelinelabs.conductor.Controller;
import com.bulana.byteorbitweather.trending.TrendingReposController;

import io.neverstoplearning.advancedandroid.R;
import com.bulana.byteorbitweather.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
