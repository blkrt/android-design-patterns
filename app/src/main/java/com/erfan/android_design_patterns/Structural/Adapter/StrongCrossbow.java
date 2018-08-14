package com.erfan.android_design_patterns.Structural.Adapter;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class StrongCrossbow implements Crossbow {
    @Override
    public void Throw() {
        System.out.println("Throwing");
    }
}
