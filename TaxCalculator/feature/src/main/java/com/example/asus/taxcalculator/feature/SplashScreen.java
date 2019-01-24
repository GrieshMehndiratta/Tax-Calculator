package com.example.asus.taxcalculator.feature;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView header;
    public static int TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*This is to remove the notification bar*/
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        header = (TextView) findViewById(R.id.textView);

        /*For splash transition*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_OUT);
    }
}
