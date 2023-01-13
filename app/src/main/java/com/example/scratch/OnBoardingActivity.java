package com.example.scratch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class OnBoardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        Handler handler = new Handler();
        Intent i = new Intent(this, LoginActivity.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                startActivity(i);
            }
        }, 1000);

    }
}