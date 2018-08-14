package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.erfan.android_design_patterns.Structural.CompositeGun;
import com.erfan.android_design_patterns.Structural.DesertEagle;

/**
 * Created by erfanblkrt on 8/14/2018.
 */

public class CompositeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);

        final CompositeGun mCompositeGun = new CompositeGun();
        final CompositeGun mCompositeGun2 = new CompositeGun();

        DesertEagle mDesertEagle = new DesertEagle();
        DesertEagle mDesertEagle2 = new DesertEagle();

        mCompositeGun2.add(mDesertEagle);
        mCompositeGun2.add(mDesertEagle2);

        mCompositeGun.add(mCompositeGun2);

        ((Button) findViewById(R.id.fire)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCompositeGun.Trigger();
            }
        });
    }
}
