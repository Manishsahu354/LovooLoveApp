package com.example.lovoocloneapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class SignUpPageActivity extends AppCompatActivity {
    private EditText mEtPassword;
    private EditText mEtUserName;
    private EditText mEtEmail;
    private Button mBtnNext;
    private Button mBtnSignUpBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        initizationAndListener();
    }
    private void initizationAndListener() {
        mEtEmail = findViewById(R.id.etEmailAddress);
        mEtPassword = findViewById(R.id.etPassword);
        mEtUserName = findViewById(R.id.etUserName);
        mBtnSignUpBack = findViewById(R.id .btnSignUpBack);
        mBtnNext = findViewById(R.id.btnNext);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDataValid()){
                    Intent intentNext = new Intent(SignUpPageActivity.this,SecondPageActivity.class);
                    startActivity(intentNext);
                }
            }
        });
        mBtnSignUpBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             finish();
            }
        });

    }private boolean isDataValid(){
        boolean isDataValid = true;
        if (mEtUserName.getText().toString().length()<4){
            mEtUserName.setError("Username should be minimum Four character");
            isDataValid = false;
        }if (mEtPassword.getText().toString().length()<6){
            mEtPassword.setError("Password should be minimum six digit");
            isDataValid = false;
        }if (!mEtEmail.getText().toString().contains("@gmail.com")){
            mEtEmail.setError("Invalid email");
            isDataValid = false;
        }
        return isDataValid;
    }
}