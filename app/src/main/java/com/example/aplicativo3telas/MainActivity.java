package com.example.aplicativo3telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e = (EditText) findViewById(R.id.editUsuaio);
                EditText e2 = (EditText) findViewById(R.id.editSenha);
                String nome = e.getText().toString();
                String ra = e2.getText().toString();
                Intent intent = new Intent(MainActivity.this, Principal.class);
                intent.putExtra("nome", nome);
                intent.putExtra("ra", ra);
                startActivity(intent);
            }
        });
    }
}