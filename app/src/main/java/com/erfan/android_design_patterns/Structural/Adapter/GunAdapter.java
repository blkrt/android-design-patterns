package com.erfan.android_design_patterns.Structural.Adapter;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class GunAdapter implements Crossbow {

    Gun mGun;

    public GunAdapter(Gun gun){
        this.mGun = gun;
    }

    @Override
    public void Throw() {
        mGun.Fire();
    }
}
