package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.erfan.android_design_patterns.Creational.Singleton.Singleton;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        ((TextView) findViewById(R.id.singleton)).setText(Singleton.getInstance().getFirstName() +
                                                            Singleton.getInstance().getLastName() +
                                                            Singleton.getInstance().getCurrentJob());
    }
}
