package com.erfan.android_design_patterns.Structural.Facade;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class HandGunShopper implements Gun {
    @Override
    public GunMenu getMenus() {
        HandGunMenu handGunMenu = new HandGunMenu();
        return handGunMenu;
    }
}
