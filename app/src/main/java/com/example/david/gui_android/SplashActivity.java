package com.example.david.gui_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        /*Go from splash screen to MainActivity*/
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
        /*Close the Splash activity*/
        finish();
    }
}
