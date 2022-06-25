package me.example.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Cursos extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }

    public void clickVoltar(View view) {
        finish();
    }

    public void clickCurPortugol(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/programacao-basica-modulo-00-primeiros-passos/"));
        startActivity(nav);
    }

    public void clickCurLingC(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/linguagem-c-modulo-00-primeiros-passos/"));
        startActivity(nav);
    }

    public void clickCurAndroid(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/android-studio-modulo-00-primeiros-passos/"));
        startActivity(nav);
    }

    public void clickCurPHP(View view) {
        nav  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/php-com-banco-de-dados-modulo-00-primeiros-passos/"));
        startActivity(nav);
    }

    public void clickCurCSharp(View view) {
        nav  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/c-modulo-00-primeiros-passos/"));
        startActivity(nav);
    }

    public void clickCurKotlin(View view) {
        nav  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/kotlin-modulo-00-primeiros-passos/"));
        startActivity(nav);
    }

    public void clickCurVideo(View view) {
        nav  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.estudonauta.com/curso/producao-de-videos-modulo-01-cameras/"));
        startActivity(nav);
    }
}