package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdNameActivity extends AppCompatActivity {
private EditText mEtFirstName;
private Button mBtnBack_03;
private Button mBtnForward_03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initilizationAndListener();
    }

    private void initilizationAndListener() {
        mEtFirstName = findViewById(R.id.etFirstName);
        mBtnBack_03 = findViewById(R.id.btnBack_03);
        mBtnForward_03 = findViewById(R.id.btnForward_03);
        mBtnForward_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialValid()){
                    Intent intentForward = new Intent(ThirdNameActivity.this,FourthActivityDOB.class);
                    String data = mEtFirstName.getText().toString();
                    intentForward.putExtra("FirstName",data);
                    startActivity(intentForward);
                }

            }
        });

        mBtnBack_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public boolean isCredentialValid(){
        boolean isDataTrue = true;
        if (mEtFirstName.getText().toString().isEmpty()){
            mEtFirstName.setError("Please Enter First Name");
            isDataTrue = false;
        }
        return isDataTrue;
    }
}