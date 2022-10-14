package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
        password = (EditText)findViewById(R.id.password);
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
            Toast.makeText(this, "Nim dan Password Sesuai",Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this, "Nim dan Password Tidak Sesuai",Toast.LENGTH_LONG).show();
        }
    }
}

