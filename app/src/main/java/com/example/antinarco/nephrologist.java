package com.example.antinarco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class nephrologist extends AppCompatActivity {
public ImageView  venu,ashwini,vikran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nephrologist);
        venu=findViewById(R.id.venu);
        ashwini=findViewById(R.id.ashwini);
        vikran=findViewById(R.id.vikran);
        venu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(nephrologist.this,dr_venu.class);
                startActivity(i);
            }
        });
        ashwini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(nephrologist.this,dr_ashwini.class);
                startActivity(i);
            }
        });
        vikran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(nephrologist.this,dr_vikranth.class);
                startActivity(i);
            }
        });
    }
}