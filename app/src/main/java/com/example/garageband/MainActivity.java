package com.example.garageband;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Buttons to hit

    private ImageButton btnGuitar;
    private ImageButton btnelectric;
    private ImageButton btnPiano;
    private ImageButton btnDrums;
    private ImageButton btnFlute;
    private ImageButton btnMystery;
    private ImageButton btnKeyboard;
    private ImageButton btnSinging;
    private ImageButton btnHarp;
    private ImageButton btnUkulele;
    private ImageButton btnViolin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGuitar = findViewById(R.id.btn_guitar);



        btnGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRiff();
            }
        });
    }

    private void playRiff(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_riff);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
}