package com.erfan.android_design_patterns;

import android.app.Application;

import com.erfan.android_design_patterns.Creational.DependencyInjection.DaggerMyComponent;
import com.erfan.android_design_patterns.Creational.DependencyInjection.MyComponent;
import com.erfan.android_design_patterns.Creational.DependencyInjection.MyModule;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class MyApplication extends Application {

    private MyComponent mMyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyComponent = createMyComponent();
    }

    MyComponent getMyComponent(){
        return mMyComponent;
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }
}
