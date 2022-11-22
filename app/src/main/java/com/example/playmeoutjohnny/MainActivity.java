package com.example.playmeoutjohnny;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageview);
        Glide.with(this).load(R.drawable.johnny).into(imageView);
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.johnny);
        mp.start();
    }
}