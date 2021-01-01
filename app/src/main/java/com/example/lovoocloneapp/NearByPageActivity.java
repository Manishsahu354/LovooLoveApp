package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NearByPageActivity extends AppCompatActivity {
    private TextView mTvNearbyBack;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_by_page);
        initializeAndViewListeners();
    }

    private void initializeAndViewListeners() {


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
        mTvNearbyBack= findViewById(R.id.tvNearbyBack);

        mTvNearbyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTvLiveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLive = new Intent(NearByPageActivity.this,LivePageActivity.class);
                startActivity(intentLive);
            }
        });
        mTvChatsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChat = new Intent(NearByPageActivity.this,ChatActivity.class);
                startActivity(intentChat);
            }
        });
        mTvNewsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNews = new Intent(NearByPageActivity.this,newsActivity.class);
                startActivity(intentNews);
            }
        });


        mTvLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLiveText= new Intent(NearByPageActivity.this,LivePageActivity.class);
                startActivity(intentStartLiveText);
            }
        });
        mTvChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatText = new Intent(NearByPageActivity.this,ChatActivity.class);
                startActivity(intentChatText);
            }
        });
        mTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewsText = new Intent(NearByPageActivity.this,newsActivity.class);
                startActivity(intentNewsText);
            }
        });

        mTvMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatch= new Intent(NearByPageActivity.this,HomeActivity.class);
                startActivity(intentMatch);
            }
        });
        mTvMatchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatchIcon= new Intent(NearByPageActivity.this,HomeActivity.class);
                startActivity(intentMatchIcon);
            }
        });
    }
}