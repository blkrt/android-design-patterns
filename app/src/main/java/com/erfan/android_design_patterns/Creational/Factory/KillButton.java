package com.erfan.android_design_patterns.Creational.Factory;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class KillButton implements IButton {
    @Override
    public String fire() {
        return "Kill it !";
    }
}
