package com.example.audiosampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OnClick Listener for buttons play
        Button play = (Button) findViewById(R.id.play_button);
        //onClick Listener for pause button
        Button pause = (Button) findViewById(R.id.pause_button);
        //making object of media player
        mediaPlayer = MediaPlayer.create(this, R.raw.track);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MainActivity.this,"I'm done",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
//                }

            }
        });


    }
}