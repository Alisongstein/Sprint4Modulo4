package com.example.myapplication8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URI;

public class MainActivity2 extends AppCompatActivity {

    private View webView;
    private Button _linkedin;
    String _url = "http://www.linkedin.com/in/luisa-alison-ramos-mu%C3%B1oz-63172119b");
    private Button _web;
    String _url1 = "https://www.instagram.com/ramosyasociados_estudio/");
    private View editTextMessage;
    private View buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextMessage);
        buttonSend = findViewById(R.id.botonEnviar);

        //Boton para Linkedin
        _linkedin = findViewById(R.id.linkedin);
        _linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW);
                startActivity(i);
            }
        });
        //Boton para instagram
        _web = findViewById(R.id.Web);
        _web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(_url1);
                Intent i = new Intent(Intent.ACTION_VIEW);
                startActivity(i);


    }
};