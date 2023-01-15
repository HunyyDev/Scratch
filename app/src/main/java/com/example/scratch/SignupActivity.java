package com.example.scratch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView tvLogin = findViewById(R.id.tvLogin);
        tvLogin.setOnTouchListener((v, event) -> {
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);
            return true;
        });
    }
}