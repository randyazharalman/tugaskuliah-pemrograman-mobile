package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView SelamatDatangTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nim = getIntent().getExtras().getString("nim");

        SelamatDatangTxt = findViewById(R.id.selamatDatangTxt);
        SelamatDatangTxt.setText("Selamat Datang "+nim);
    }
}