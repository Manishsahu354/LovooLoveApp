package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartTheDating extends AppCompatActivity {

    private Button mBtnStartDating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_the_dating);

        mBtnStartDating = findViewById(R.id.btnStartDating);
        mBtnStartDating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartDating = new Intent(StartTheDating.this,HomeActivity.class);
                startActivity(intentStartDating);
            }
        });
    }
}