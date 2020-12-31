package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GenderFifthActivity extends AppCompatActivity {
    private Button mBtnFemale;
    private Button mBtnMale;
    private Button mBtnBackGender;
    private Button mBtnForwardGender;
    boolean check = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_fifth);
        initializeAndViewListeners();
    }

    private void initializeAndViewListeners() {
        mBtnFemale = findViewById(R.id.btnFemale);
        mBtnMale = findViewById(R.id.btnMale);
        mBtnBackGender = findViewById(R.id.btnBackGender);
        mBtnForwardGender = findViewById(R.id.btnForwardGender);
       mBtnFemale.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               check = true;
               mBtnFemale.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
               mBtnMale.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
               mBtnMale.setTextColor(getResources().getColor(R.color.white));
               mBtnFemale.setTextColor(getResources().getColor(R.color.black));

           }
       });
       mBtnMale.setOnClickListener(new View.OnClickListener() {
        @Override
           public void onClick(View v) {
            check = true;
            mBtnFemale.setBackground(getResources().getDrawable(R.drawable.rectangle_male_female));
            mBtnMale.setBackground(getResources().getDrawable(R.drawable.button_change_color_white));
            mBtnFemale.setTextColor(getResources().getColor(R.color.white));
            mBtnMale.setTextColor(getResources().getColor(R.color.black));
           }
       });

       mBtnForwardGender.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (check==true){
                   Intent intentForward = new Intent(GenderFifthActivity.this,SixthActivity.class);

                   startActivity(intentForward);
               }else {
                  Toast.makeText(GenderFifthActivity.this,"Choose One",Toast.LENGTH_SHORT).show();
               }
           }
       });
       mBtnBackGender.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               finish();
           }
       });

       }


}
