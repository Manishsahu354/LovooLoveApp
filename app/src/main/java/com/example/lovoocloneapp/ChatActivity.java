package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    private TextView mTvChatsBack;
    private Button mBtnGetPremium;
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
        setContentView(R.layout.activity_chat);
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
        mBtnGetPremium = findViewById(R.id.btnMoreLikes);
        mTvChatsBack = findViewById(R.id.tvChatsBack);

        mBtnGetPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatch= new Intent(ChatActivity.this,HomeActivity.class);
                startActivity(intentMatch);
            }
        });
        mTvChatsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTvLiveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,LivePageActivity.class);
                startActivity(intent);
            }
        });
        mTvChatsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChat = new Intent(ChatActivity.this,ChatActivity.class);
                startActivity(intentChat);
            }
        });
        mTvNewsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNews = new Intent(ChatActivity.this,newsActivity.class);
                startActivity(intentNews);
            }
        });

        mTvNearbyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearby= new Intent(ChatActivity.this,NearByPageActivity.class);
                startActivity(intentNearby);
            }
        });
        mTvLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLiveText= new Intent(ChatActivity.this,LivePageActivity.class);
                startActivity(intentStartLiveText);
            }
        });
        mTvChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatText = new Intent(ChatActivity.this,ChatActivity.class);
                startActivity(intentChatText);
            }
        });
        mTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewsText = new Intent(ChatActivity.this,newsActivity.class);
                startActivity(intentNewsText);
            }
        });
        mTvNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearbyText= new Intent(ChatActivity.this,NearByPageActivity.class);
                startActivity(intentNearbyText);
            }
        });
        mTvMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatch= new Intent(ChatActivity.this,HomeActivity.class);
                startActivity(intentMatch);
            }
        });
        mTvMatchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatchIcon= new Intent(ChatActivity.this,HomeActivity.class);
                startActivity(intentMatchIcon);
            }
        });

    }
}