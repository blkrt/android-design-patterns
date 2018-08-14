package com.erfan.android_design_patterns.Structural.Facade;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class GunShopper {

    public HandGunMenu getHandGunMenu() {
        HandGunShopper mHandGunShopper = new HandGunShopper();
        HandGunMenu menu = (HandGunMenu) mHandGunShopper.getMenus();
        return menu;
    }

    public RifleGunMenu getRifleGunMenu() {
        RifleGunShopper mRifleGunShopper = new RifleGunShopper();
        RifleGunMenu menu = (RifleGunMenu) mRifleGunShopper.getMenus();
        return menu;
    }
}
