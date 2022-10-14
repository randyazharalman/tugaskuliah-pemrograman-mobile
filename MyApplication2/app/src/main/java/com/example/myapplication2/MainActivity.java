package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText NIM, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.btn_login);
        NIM = (EditText)findViewById(R.id.nim);
        password = (EditText)findViewById(R.id.pass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login(){
        String usernim = NIM.getText().toString().trim();
        String userpass = password.getText().toString().trim();
        if(usernim.equals("C2083207014")&& userpass.equals("12345")){
            Toast.makeText(this, "Login Berhasil",Toast.LENGTH_LONG).show();
            move();
        } else{
            Toast.makeText(this, "Nim dan Password Tidak Sesuai",Toast.LENGTH_LONG).show();
        }
    }

    public void move() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nim",NIM.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);
    }
}