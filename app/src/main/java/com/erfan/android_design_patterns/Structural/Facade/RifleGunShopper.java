package com.erfan.android_design_patterns.Structural.Facade;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class RifleGunShopper implements Gun {
    @Override
    public GunMenu getMenus() {
        RifleGunMenu rifleGunMenu = new RifleGunMenu();
        return rifleGunMenu;
    }
}
