package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SevenInterestedActivity extends AppCompatActivity {
 private Button mBtnMen;
 private Button mBtnWomen;
 private Button mBtnEveryone;
 private Button mBtnForwardInterested;
 private Button mBtnBackInterested;
 private boolean check = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interrested_seven);
        initializeAndViewListeners();
    }
    private void initializeAndViewListeners() {
        mBtnWomen = findViewById(R.id.btnWomen);
        mBtnMen = findViewById(R.id.btnMen);
        mBtnEveryone = findViewById(R.id.btnEveryone);
        mBtnBackInterested = findViewById(R.id.btnBackInterested);
        mBtnForwardInterested = findViewById(R.id.btnForwardInterested);
        mBtnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                mBtnWomen.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnMen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnEveryone.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnMen.setTextColor(getResources().getColor(R.color.white));
                mBtnEveryone.setTextColor(getResources().getColor(R.color.white));
                mBtnWomen.setTextColor(getResources().getColor(R.color.black));

            }
        });
        mBtnMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                mBtnWomen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnEveryone.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnMen.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnWomen.setTextColor(getResources().getColor(R.color.white));
                mBtnEveryone.setTextColor(getResources().getColor(R.color.white));
                mBtnMen.setTextColor(getResources().getColor(R.color.black));
            }
        });
        mBtnEveryone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                check = true;
                mBtnWomen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnMen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnEveryone.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnWomen.setTextColor(getResources().getColor(R.color.white));
                mBtnMen.setTextColor(getResources().getColor(R.color.white));
                mBtnEveryone.setTextColor(getResources().getColor(R.color.black));
            }
        });

        mBtnForwardInterested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check==true){
                    Intent intentForward = new Intent(SevenInterestedActivity.this,StartTheDating.class);
                    startActivity(intentForward);
                }else {
                    mBtnWomen.setError("choose one");
                    mBtnMen.setError("choose one");
                    mBtnEveryone.setError("choose one");
                }
            }
        });
        mBtnBackInterested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}