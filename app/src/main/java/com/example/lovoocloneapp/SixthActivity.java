package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {
private Button mBtnSomething ;
private Button mBtnNewFriends ;
private Button mBtnLetsSeeWhatHappen;
private Button mBtnSomethingCasual ;
private Button mBtnForwardLooking ;
private Button mBtnBackLooking ;
private  boolean check = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        initializeAndViewListeners();
    }
    private void initializeAndViewListeners() {
        mBtnSomething = findViewById(R.id.btnSomething);
        mBtnNewFriends= findViewById(R.id.btnNewFriends);
        mBtnLetsSeeWhatHappen = findViewById(R.id.btnLetsSeeWhatHappen);
        mBtnSomethingCasual = findViewById(R.id.btnSomethingCasual);
        mBtnForwardLooking = findViewById(R.id.btnForwardLooking);
        mBtnBackLooking = findViewById(R.id.btnBackLooking);
        mBtnSomething.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                mBtnSomething.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnNewFriends.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnLetsSeeWhatHappen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnSomethingCasual.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnNewFriends.setTextColor(getResources().getColor(R.color.white));
                mBtnLetsSeeWhatHappen.setTextColor(getResources().getColor(R.color.white));
                mBtnSomethingCasual.setTextColor(getResources().getColor(R.color.white));
                mBtnSomething.setTextColor(getResources().getColor(R.color.black));

            }
        });
        mBtnNewFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                mBtnNewFriends.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnSomething.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnLetsSeeWhatHappen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnSomethingCasual.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnSomething.setTextColor(getResources().getColor(R.color.white));
                mBtnLetsSeeWhatHappen.setTextColor(getResources().getColor(R.color.white));
                mBtnSomethingCasual.setTextColor(getResources().getColor(R.color.white));
                mBtnNewFriends.setTextColor(getResources().getColor(R.color.black));

            }
        });
        mBtnLetsSeeWhatHappen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                mBtnLetsSeeWhatHappen.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnSomething.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnNewFriends.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnSomethingCasual.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnSomething.setTextColor(getResources().getColor(R.color.white));
                mBtnNewFriends.setTextColor(getResources().getColor(R.color.white));
                mBtnSomethingCasual.setTextColor(getResources().getColor(R.color.white));
                mBtnLetsSeeWhatHappen.setTextColor(getResources().getColor(R.color.black));

            }
        });
        mBtnSomethingCasual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                mBtnSomethingCasual.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
                mBtnSomething.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnNewFriends.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnLetsSeeWhatHappen.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
                mBtnSomething.setTextColor(getResources().getColor(R.color.white));
                mBtnNewFriends.setTextColor(getResources().getColor(R.color.white));
               mBtnLetsSeeWhatHappen.setTextColor(getResources().getColor(R.color.white));
                mBtnSomethingCasual.setTextColor(getResources().getColor(R.color.black));

            }
        });

        mBtnForwardLooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check==true){
                    Intent intentForward = new Intent(SixthActivity.this,SevenInterestedActivity.class);
                    startActivity(intentForward);
                }else {
                    mBtnSomethingCasual.setError("choose one");
                    mBtnSomething.setError("choose one");
                    mBtnNewFriends.setError("choose one");
                    mBtnSomethingCasual.setError("choose one");
                }
            }
        });
        mBtnBackLooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}