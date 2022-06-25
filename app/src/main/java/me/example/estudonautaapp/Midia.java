package me.example.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Midia extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midia);

        video = findViewById(R.id.video);

        String caminho = "android.resource://me.example.estudonautaapp/" + R.raw.estudonauta;

        Uri arquivo = Uri.parse(caminho);
        video.setVideoURI(arquivo);

        video.start();

    }

    public void clickVoltar(View view) {
        finish();
    }
}