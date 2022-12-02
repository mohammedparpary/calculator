package com.testapp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // The Code Of Intent For Going From Splash Screen To Main Activity

                Intent intentSplash = new Intent(splashActivity.this,MainActivity.class);
                startActivity(intentSplash);
                finish();

            }
        },5000); // Number Of Milli Seconds  ----  1000 milli second = 1 second
    }
}