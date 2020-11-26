package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    WebView url2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        url2 = (WebView) findViewById(R.id.weburl);

        Intent rec = getIntent();
        Bundle b = rec.getExtras();
        String j =(String) b.get("nom");

        if(b!=null){
            url2.loadUrl(j);
        }
        final WebSettings confwe = url2.getSettings();
        confwe.setJavaScriptEnabled(true);
        //url2.loadUrl(j);
    }
}