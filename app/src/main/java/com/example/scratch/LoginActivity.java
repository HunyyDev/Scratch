package com.example.scratch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView tvCreateAccount = findViewById(R.id.tvCreateNewAccount);
        tvCreateAccount.setOnTouchListener((v, event) -> {
            Intent i = new Intent(getApplicationContext(), SignupActivity.class);
            startActivity(i);
            return true;
        });
    }
}