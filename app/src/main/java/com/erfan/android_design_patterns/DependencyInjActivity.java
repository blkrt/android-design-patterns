package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.erfan.android_design_patterns.Creational.DependencyInjection.IDate;

import java.util.Date;

import javax.inject.Inject;

/**
 * Created by erfanblkrt on 8/5/2018.
 */


public class DependencyInjActivity extends AppCompatActivity {

    @Inject IDate mIDate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_injection);

        ((MyApplication) getApplication())
                .getMyComponent()
                .inject(DependencyInjActivity.this);

        ((TextView) findViewById(R.id.dependency_injection)).setText("Time is : " + new Date(mIDate.getDate()).toString());
    }
}
