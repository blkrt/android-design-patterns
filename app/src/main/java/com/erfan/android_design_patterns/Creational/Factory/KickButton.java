package com.erfan.android_design_patterns.Creational.Factory;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class KickButton implements IButton {
    @Override
    public String fire() {
        return "Kick it !";
    }
}
