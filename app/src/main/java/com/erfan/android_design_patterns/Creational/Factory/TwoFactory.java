package com.erfan.android_design_patterns.Creational.Factory;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class TwoFactory implements IFaceFactory {
    @Override
    public IButton createButton() {
        return new KillButton();
    }
}
