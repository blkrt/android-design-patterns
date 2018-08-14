package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.erfan.android_design_patterns.Structural.Adapter.DesertEagle;
import com.erfan.android_design_patterns.Structural.Adapter.GunAdapter;
import com.erfan.android_design_patterns.Structural.Adapter.StrongCrossbow;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        final DesertEagle mDesertEagle = new DesertEagle();
        final StrongCrossbow mStrongCrossbow = new StrongCrossbow();
        final GunAdapter mGunAdapter = new GunAdapter(mDesertEagle);

        (findViewById(R.id.fire)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDesertEagle.Fire();
            }
        });

        (findViewById(R.id.throww)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStrongCrossbow.Throw();
                mGunAdapter.Throw();
            }
        });
    }
}
