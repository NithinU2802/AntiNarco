package com.example.antinarco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class neurologist extends AppCompatActivity {
public ImageView  raj,puneet,bala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neurologist);
        raj=findViewById(R.id.rajiv);
        puneet=findViewById(R.id.pineet);
        bala=findViewById(R.id.bala);
        raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(neurologist.this,dr_rajiv.class);
                startActivity(intent);
                finish();
            }
        }); puneet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(neurologist.this,dr_puneet.class);
                startActivity(intent);
                finish();
            }
        });
        bala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(neurologist.this,dr_bala.class);
                startActivity(intent);
                finish();
            }
        });


    }
}