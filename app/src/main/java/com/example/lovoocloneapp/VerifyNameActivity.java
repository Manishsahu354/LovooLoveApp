package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VerifyNameActivity extends AppCompatActivity {
private TextView mTvFirstName;
private TextView mTvProfileBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_name);
        mTvFirstName = findViewById(R.id.etFirstName);
        mTvProfileBack = findViewById(R.id.tvProfileBack);
        mTvProfileBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        getDataFromIntent();
    }

    private void getDataFromIntent() {

        if (getIntent()!=null && getIntent().getExtras()!=null){
            String data = getIntent().getStringExtra("FirstName");
            mTvFirstName.setText(data);
        }
    }
}
