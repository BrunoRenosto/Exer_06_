package com.example.exer_06_;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class terc extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terc);

        // Recuperando view da activity
        Button next = findViewById(R.id.nextBtn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Criando um intent explícito
                // Recupera-se o contexto da view
                // Chama-se explicitamente a classe da activity que deseja abrir
                Intent intent = new Intent(v.getContext(), tarefa.class);

                // Inicia-se a activity
                startActivity(intent);
            }
        });
    }





}