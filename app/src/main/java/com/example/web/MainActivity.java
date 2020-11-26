package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = (EditText) findViewById(R.id.txtUrl);
    }

    public void env (View view){
        String s = url.getText().toString();
        Intent env = new Intent(MainActivity.this, MainActivity2.class);
        env.putExtra("nom",s);
        startActivity(env);
        url.setText("");
    }
}