package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
private TextView mTvProfileIcon;
private TextView mTvFilterIcon;
private TextView mTvNearbyIcon;
private TextView mTvLiveIcon;
private TextView mTvMatchIcon;
private TextView mTvChatsIcon;
private TextView mTvNewsIcon;
private TextView mTvNearby;
private TextView mTvLive;
private TextView mTvMatch;
private TextView mTvChats;
private TextView mTvNews;
private Button mBtnCrossInImage;
private Button mBtnChatInImage;
private Button mBtnLikeInImage;
private ImageView mImgPicOne;
private ImageView mImgPicTwo;
private ImageView mImgPicThree;
private ImageView mImgPicFour;
private ImageView mImgPicFive;
private ImageView mImgPicSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initializeAndViewListeners();
    }

    private void initializeAndViewListeners() {
        mTvProfileIcon = findViewById(R.id.tvProfileIcon);
        mTvFilterIcon = findViewById(R.id.tvFilterIcon);
        mTvNearbyIcon = findViewById(R.id.tvNearbyIcon);
        mTvLiveIcon = findViewById(R.id.tvLiveIcon);
        mTvMatchIcon = findViewById(R.id.tvMatchIcon);
        mTvChatsIcon = findViewById(R.id.tvChatsIcon);
        mTvNewsIcon = findViewById(R.id.tvNewsIcon);
        mTvNearby = findViewById(R.id.tvNearby);
        mTvLive = findViewById(R.id.tvLive);
        mTvMatch = findViewById(R.id.tvMatch);
        mTvChats = findViewById(R.id.tvChats);
        mTvNews = findViewById(R.id.tvNews);
        mBtnCrossInImage = findViewById(R.id.btnCrossInImage);
        mBtnChatInImage = findViewById(R.id.btnChatInImage);
        mBtnLikeInImage = findViewById(R.id.btnLikeInImage);
        mImgPicOne = findViewById(R.id.picOne);
        mImgPicTwo = findViewById(R.id.picTwo);
        mImgPicThree = findViewById(R.id.picThree);
        mImgPicFour = findViewById(R.id.picFour);
        mImgPicFive = findViewById(R.id.picFive);
        mImgPicSix = findViewById(R.id.picSix);
        mBtnLikeInImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mImgPicSix.getVisibility()==View.VISIBLE){
                    mImgPicSix.setVisibility(View.INVISIBLE);
                }else {
                    mImgPicSix.setVisibility(View.VISIBLE);
                }
            }
        });
        mBtnLikeInImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this,"You Liked",Toast.LENGTH_SHORT).show();

                if (mImgPicSix.getVisibility()==View.VISIBLE){
                    mImgPicSix.setVisibility(View.INVISIBLE);
                    mImgPicFive.setVisibility(View.VISIBLE);
                }else if(mImgPicFive.getVisibility()==View.VISIBLE){
                    mImgPicFive.setVisibility(View.INVISIBLE);
                    mImgPicFour.setVisibility(View.VISIBLE);
                }
                else if(mImgPicFour.getVisibility()==View.VISIBLE){
                    mImgPicFour.setVisibility(View.INVISIBLE);
                    mImgPicThree.setVisibility(View.VISIBLE);
                }else if(mImgPicThree.getVisibility()==View.VISIBLE){
                    mImgPicThree.setVisibility(View.INVISIBLE);
                    mImgPicTwo.setVisibility(View.VISIBLE);
                }else if(mImgPicTwo.getVisibility()==View.VISIBLE){
                    mImgPicTwo.setVisibility(View.INVISIBLE);
                    mImgPicOne.setVisibility(View.VISIBLE);
                }else if(mImgPicOne.getVisibility()==View.VISIBLE) {
                    mImgPicOne.setVisibility(View.INVISIBLE);
                    mImgPicSix.setVisibility(View.VISIBLE);
                }else{
                    mImgPicSix.setVisibility(View.VISIBLE);
                }


            }
        });
        mBtnChatInImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatFromChatInImage = new Intent(HomeActivity.this,ChatActivity.class);
                startActivity(intentChatFromChatInImage);
            }
        });
        mBtnCrossInImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this,"You Disliked",Toast.LENGTH_SHORT).show();
                if (mImgPicSix.getVisibility()==View.VISIBLE){
                    mImgPicSix.setVisibility(View.INVISIBLE);
                    mImgPicFive.setVisibility(View.VISIBLE);
                }else if(mImgPicFive.getVisibility()==View.VISIBLE){
                    mImgPicFive.setVisibility(View.INVISIBLE);
                    mImgPicFour.setVisibility(View.VISIBLE);
                }
                else if(mImgPicFour.getVisibility()==View.VISIBLE){
                    mImgPicFour.setVisibility(View.INVISIBLE);
                    mImgPicThree.setVisibility(View.VISIBLE);
                }else if(mImgPicThree.getVisibility()==View.VISIBLE){
                    mImgPicThree.setVisibility(View.INVISIBLE);
                    mImgPicTwo.setVisibility(View.VISIBLE);
                }else if(mImgPicTwo.getVisibility()==View.VISIBLE){
                    mImgPicTwo.setVisibility(View.INVISIBLE);
                    mImgPicOne.setVisibility(View.VISIBLE);
                }else if(mImgPicOne.getVisibility()==View.VISIBLE) {
                    mImgPicOne.setVisibility(View.INVISIBLE);
                    mImgPicSix.setVisibility(View.VISIBLE);
                }else{
                    mImgPicSix.setVisibility(View.VISIBLE);
                }
            }
        });
        mTvLiveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLive = new Intent(HomeActivity.this,LivePageActivity.class);
                startActivity(intentStartLive);
            }
        });
        mTvChatsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChat = new Intent(HomeActivity.this,ChatActivity.class);
                startActivity(intentChat);
            }
        });
        mTvNewsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNews = new Intent(HomeActivity.this,newsActivity.class);
                startActivity(intentNews);
            }
        });
        mTvProfileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(HomeActivity.this,VerifyNameActivity.class);
                startActivity(intentProfile);
            }
        });
        mTvNearbyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearby= new Intent(HomeActivity.this,NearByPageActivity.class);
                startActivity(intentNearby);
            }
        });
        mTvLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLiveText= new Intent(HomeActivity.this,LivePageActivity.class);
                startActivity(intentStartLiveText);
            }
        });
        mTvChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatText = new Intent(HomeActivity.this,ChatActivity.class);
                startActivity(intentChatText);
            }
        });
        mTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewsText = new Intent(HomeActivity.this,newsActivity.class);
                startActivity(intentNewsText);
            }
        });
        mTvNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearbyText= new Intent(HomeActivity.this,NearByPageActivity.class);
                startActivity(intentNearbyText);
            }
        });
    }
}