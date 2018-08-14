package com.erfan.android_design_patterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mBuilder;
    TextView mFactory;
    TextView mSingleton;
    TextView mDependencyInjection;
    TextView mComposite;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBuilder = (TextView) findViewById(R.id.builder);
        mFactory = (TextView) findViewById(R.id.factory);
        mSingleton = (TextView) findViewById(R.id.singleton);
        mDependencyInjection = (TextView) findViewById(R.id.dependency_injection);
        mComposite = (TextView) findViewById(R.id.composite);
        mBuilder.setOnClickListener(this);
        mFactory.setOnClickListener(this);
        mSingleton.setOnClickListener(this);
        mDependencyInjection.setOnClickListener(this);
        mComposite.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mBuilder) {
            startActivity(new Intent(this, BuilderActivity.class));
        } else if (view == mFactory) {
            startActivity(new Intent(this, FactoryActivity.class));
        } else if (view == mSingleton) {
            startActivity(new Intent(this, SingletonActivity.class));
        } else if (view == mDependencyInjection) {
            startActivity(new Intent(this, DependencyInjActivity.class));
        } else if (view == mComposite) {
            startActivity(new Intent(this, CompositeActivity.class));
        }
    }
}
