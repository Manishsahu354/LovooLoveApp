package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondPageActivity extends AppCompatActivity {

    private Button mBtnLetsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        mBtnLetsGo = findViewById(R.id.btnLetsGo);
        mBtnLetsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLetsGo = new Intent(SecondPageActivity.this,ThirdNameActivity.class);
                startActivity(intentLetsGo);
            }
        });

    }
}