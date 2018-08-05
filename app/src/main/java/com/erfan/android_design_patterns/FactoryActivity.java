package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.erfan.android_design_patterns.Creational.Factory.IButton;
import com.erfan.android_design_patterns.Creational.Factory.IFaceFactory;
import com.erfan.android_design_patterns.Creational.Factory.OneFactory;
import com.erfan.android_design_patterns.Creational.Factory.TwoFactory;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class FactoryActivity extends AppCompatActivity {

    IFaceFactory mIFaceFactory = null;

    IButton mIButton = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        (findViewById(R.id.kick)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIFaceFactory = new OneFactory();
                mIButton = mIFaceFactory.createButton();
                ((TextView) findViewById(R.id.factory_text)).setText(mIButton.fire());
            }
        });

        (findViewById(R.id.kill)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIFaceFactory = new TwoFactory();
                mIButton = mIFaceFactory.createButton();
                ((TextView) findViewById(R.id.factory_text)).setText(mIButton.fire());
            }
        });

    }
}
