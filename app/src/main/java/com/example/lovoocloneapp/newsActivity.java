package com.example.lovoocloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newsActivity extends AppCompatActivity {
    private TextView mTvNewsBack;
    private TextView mTvLikes;
    private TextView mTvGlances;
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
    private Button mBtnMoreLikes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

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
        mTvNewsBack = findViewById(R.id.tvNewsBack);
        mTvLikes = findViewById(R.id.tvlikes);
        mTvGlances = findViewById(R.id.tvglances);
        mBtnMoreLikes = findViewById(R.id.btnMoreLikes);
        mTvNewsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mBtnMoreLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatch = new Intent(newsActivity.this,HomeActivity.class);
                startActivity(intentMatch);
            }
        });

        mTvLiveIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsActivity.this,LivePageActivity.class);
                startActivity(intent);
            }
        });
        mTvChatsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChat = new Intent(newsActivity.this,ChatActivity.class);
                startActivity(intentChat);
            }
        });
        mTvNewsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNews = new Intent(newsActivity.this,newsActivity.class);
                startActivity(intentNews);
            }
        });

        mTvNearbyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearby= new Intent(newsActivity.this,NearByPageActivity.class);
                startActivity(intentNearby);
            }
        });
        mTvLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartLiveText= new Intent(newsActivity.this,LivePageActivity.class);
                startActivity(intentStartLiveText);
            }
        });
        mTvChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatText = new Intent(newsActivity.this,ChatActivity.class);
                startActivity(intentChatText);
            }
        });
        mTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewsText = new Intent(newsActivity.this,newsActivity.class);
                startActivity(intentNewsText);
            }
        });
        mTvNearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNearbyText= new Intent(newsActivity.this,NearByPageActivity.class);
                startActivity(intentNearbyText);
            }
        });
        mTvMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatch= new Intent(newsActivity.this,HomeActivity.class);
                startActivity(intentMatch);
            }
        });
        mTvMatchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMatchIcon= new Intent(newsActivity.this,HomeActivity.class);
                startActivity(intentMatchIcon);
            }
        });
        mTvLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvLikes.setTextColor(getResources().getColor(R.color.light_blue));
                mTvGlances.setTextColor(getResources().getColor(R.color.black));
            }
        });
        mTvGlances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvGlances.setTextColor(getResources().getColor(R.color.light_blue));
                mTvLikes.setTextColor(getResources().getColor(R.color.black));
            }
        });
    }
}