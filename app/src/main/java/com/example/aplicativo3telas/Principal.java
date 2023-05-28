package com.example.aplicativo3telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView t = (TextView) findViewById(R.id.txtMsg);
        String nome = getIntent().getStringExtra("nome");
        String ra = getIntent().getStringExtra("ra");
        t.setText(nome+" "+ra);
    }
}