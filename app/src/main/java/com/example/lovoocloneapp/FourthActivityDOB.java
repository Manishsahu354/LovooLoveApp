package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FourthActivityDOB extends AppCompatActivity {
private EditText mEtDd;
private EditText mEtMM;
private EditText mEtYyyy;
private Button mBtnBack_01;
private Button mBtnForward_01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_d_o_b);
        initilizationAndListener();
    }

    private void initilizationAndListener() {
            mBtnBack_01 = findViewById(R.id.btnBack_01);
            mBtnForward_01 =findViewById(R.id.btnForward_01);
            mEtDd = findViewById(R.id.etDD);
            mEtMM = findViewById(R.id.etMM);
            mEtYyyy = findViewById(R.id.etYYYY);
            mBtnForward_01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isDataValid()){
                        Intent intentForward_01 = new Intent(FourthActivityDOB.this,GenderFifthActivity.class);
                        startActivity(intentForward_01);
                    }
                }
            });
            mBtnBack_01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   finish();
                }
            });
    }
    private boolean isDataValid (){
        boolean isDataTrue = true;
        if (mEtDd.getText().toString().length()!=2 ){
            mEtDd.setError("Invalid Date");
            isDataTrue = false;
        }
        if (mEtMM.getText().toString().length()!=2){
            mEtMM.setError("Invalid Month");
            isDataTrue = false;
        }
        if (mEtYyyy.getText().toString().length()!=4){
            mEtYyyy.setError("Invalid Year");
            isDataTrue = false;
        }
        return isDataTrue;
    }

}