package com.example.garageband;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SoundBoardGarageBand extends AppCompatActivity {

    private ImageButton btnSoundRiff, btnDistorted, btnDrums, btnKeyboard, btnSinging;
    private Button btnViolin, btnPiano, btnMystery, btnFlute, btnUkelele, btnHarp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundboard_garageband);

        btnSoundRiff = findViewById(R.id.btn_soundriff);
        btnDistorted = findViewById(R.id.btn_distored);
        btnDrums = findViewById(R.id.btn_drums);
        btnKeyboard = findViewById(R.id.btn_keyboard);
        btnSinging = findViewById(R.id.btn_singing);
        btnViolin = findViewById(R.id.btn_violin);
        btnPiano = findViewById(R.id.btn_piano);
        btnMystery = findViewById(R.id.btn_mystery);
        btnFlute = findViewById(R.id.btn_flute);
        btnUkelele = findViewById(R.id.btn_ukulele);
        btnHarp = findViewById(R.id.btn_harp);


        btnSoundRiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRiff();
            }
        });

        btnDistorted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDistorted();
            }
        });

        btnDrums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDrums();
            }
        });

        btnKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playKeyboard();
            }
        });

        btnSinging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSinging();
            }
        });

        btnViolin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playViolin();
            }
        });

        btnPiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPiano();
            }
        });

        btnMystery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMystery();
            }
        });

        btnFlute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFlute();
            }
        });

        btnUkelele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playUkelele();
            }
        });

        btnHarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHarp();
            }
        });
    }

    private void playRiff(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_sound_riff);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playDistorted(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_disorted);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playDrums(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_drums);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playKeyboard(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_keyboard);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playSinging(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_singing);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playViolin(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_violin);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playPiano(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_piano);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playMystery(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_mystery);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playFlute(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_flute);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playUkelele(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_ukulele);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playHarp(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_garageband_harp);
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