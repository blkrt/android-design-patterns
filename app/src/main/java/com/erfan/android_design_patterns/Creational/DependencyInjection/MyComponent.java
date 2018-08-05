package com.erfan.android_design_patterns.Creational.DependencyInjection;

import com.erfan.android_design_patterns.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
