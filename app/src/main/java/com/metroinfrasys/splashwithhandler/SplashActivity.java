package com.metroinfrasys.splashwithhandler;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static final long DELEY_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        };


        Handler handler = new Handler();
        handler.postDelayed(runnable, DELEY_TIME);




    }

    public void nextActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
