package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.erfan.android_design_patterns.Structural.Facade.GunShopper;
import com.erfan.android_design_patterns.Structural.Facade.HandGunMenu;
import com.erfan.android_design_patterns.Structural.Facade.RifleGunMenu;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        final GunShopper mGunShopper = new GunShopper();

        (findViewById(R.id.handgun_menu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandGunMenu menu = mGunShopper.getHandGunMenu();
                for(String item: menu.getHandGuns())
                    System.out.println(item);
            }
        });

        (findViewById(R.id.rifle_menu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RifleGunMenu menu = mGunShopper.getRifleGunMenu();
                for(String item: menu.getRifle())
                    System.out.println(item);
            }
        });
    }
}
