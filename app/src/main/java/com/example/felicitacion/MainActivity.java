package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        TextView titulo = findViewById(R.id.titulo);
        titulo.startAnimation(animacion);

        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView text1 = findViewById(R.id.text1);
        text1.startAnimation(animacion2);

        Animation animacion3 = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView text2 = findViewById(R.id.text2);
        text2.startAnimation(animacion2);
    }
}