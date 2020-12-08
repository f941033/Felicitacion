package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Typeface myFont = Typeface.createFromAsset(getAssets(), "Beauty and the Beast Sample.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setTypeface(myFont);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView texto1 = (TextView) findViewById(R.id.textView1);
        TextView texto2 = (TextView) findViewById(R.id.textView2);

        texto1.startAnimation(slideUp);
        texto2.startAnimation(slideUp);
*/
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}