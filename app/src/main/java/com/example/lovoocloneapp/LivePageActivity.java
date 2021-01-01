package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LivePageActivity extends AppCompatActivity {
    private TextView mTvProfileLive;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_page);
        initializeAndViewListeners();
    }

    private void initializeAndViewListeners() {
        mTvProfileLive = findViewById(R.id.tvProfileLive);
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
        mTvLiveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLive = new Intent(LivePageActivity.this,LivePageActivity.class);
                startActivity(intentStartLive);
            }
        });
        mTvChatsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChat = new Intent(LivePageActivity.this,ChatActivity.class);
                startActivity(intentChat);
            }
        });
        mTvNewsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNews = new Intent(LivePageActivity.this,newsActivity.class);
                startActivity(intentNews);
            }
        });
        mTvProfileLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(LivePageActivity.this,VerifyNameActivity.class);
                startActivity(intentProfile);
            }
        });
        mTvNearbyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearby= new Intent(LivePageActivity.this,NearByPageActivity.class);
                startActivity(intentNearby);
            }
        });
        mTvLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLiveText= new Intent(LivePageActivity.this,LivePageActivity.class);
                startActivity(intentStartLiveText);
            }
        });
        mTvChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatText = new Intent(LivePageActivity.this,ChatActivity.class);
                startActivity(intentChatText);
            }
        });
        mTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewsText = new Intent(LivePageActivity.this,newsActivity.class);
                startActivity(intentNewsText);
            }
        });
        mTvNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearbyText= new Intent(LivePageActivity.this,NearByPageActivity.class);
                startActivity(intentNearbyText);
            }
        });
        mTvMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatch= new Intent(LivePageActivity.this,HomeActivity.class);
                startActivity(intentMatch);
            }
        });
        mTvMatchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatchIcon= new Intent(LivePageActivity.this,HomeActivity.class);
                startActivity(intentMatchIcon);
            }
        });
    }
}