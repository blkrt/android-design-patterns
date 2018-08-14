package com.erfan.android_design_patterns.Structural.Adapter;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class DesertEagle implements Gun {
    @Override
    public void Reload() {
        System.out.println("Reloading");
    }

    @Override
    public void Fire() {
        System.out.println("Fire");
    }
}
