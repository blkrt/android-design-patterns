package com.erfan.android_design_patterns.Structural;

import java.util.ArrayList;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class CompositeGun implements Gun {

    private ArrayList<Gun> childGuns = new ArrayList<>();

    @Override
    public void Trigger() {
        for(Gun gun: childGuns) {
            gun.Trigger();
        }
    }

    public void add(Gun gun){
        childGuns.add(gun);
    }

    public void remove(Gun gun){
        childGuns.remove(gun);
    }
}
