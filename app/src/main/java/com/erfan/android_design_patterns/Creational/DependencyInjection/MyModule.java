package com.erfan.android_design_patterns.Creational.DependencyInjection;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

@Module
public class MyModule {

    @Provides
    @Singleton
    static IDate provideMyDate() {
        return new DateImpl();
    }
}
