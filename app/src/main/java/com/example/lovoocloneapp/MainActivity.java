package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button mBtnGoogle;
private Button mBtnFacebook;
private TextView mTvContinueWithEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initlizationAndListener();
    }

    private void initlizationAndListener() {
        mBtnFacebook = findViewById(R.id.btnFacebook);
        mBtnGoogle = findViewById(R.id.btnGoogle);
        mTvContinueWithEmail = findViewById(R.id.tvContinueWithEmail);
        mBtnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoogle = new Intent(MainActivity.this,SignUpPageActivity.class);
                startActivity(intentGoogle);
            }
        });
        mBtnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFacebook = new Intent(MainActivity.this,SignUpPageActivity.class);
                startActivity(intentFacebook);
            }
        });
        mTvContinueWithEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEmail = new Intent(MainActivity.this,SignUpPageActivity.class);
                startActivity(intentEmail);
            }
        });
    }
}