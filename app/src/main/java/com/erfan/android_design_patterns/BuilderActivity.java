package com.erfan.android_design_patterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.erfan.android_design_patterns.Creational.Builder.User;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        // create instance of builder class
        User mUser = new User.Builder()
                .setFirstName("erfan")
                .setLastName("ghaffari")
                .setAge(23)
                .create();

        ((TextView ) findViewById(R.id.first_name)).setText("My first name is : " + mUser.getFirstName());
        ((TextView ) findViewById(R.id.last_name)).setText("My Lastname is : " + mUser.getLastName());
        ((TextView ) findViewById(R.id.age)).setText("My age is  : " + mUser.getAge());

    }
}
