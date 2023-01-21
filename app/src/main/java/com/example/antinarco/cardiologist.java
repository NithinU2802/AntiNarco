package com.example.antinarco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cardiologist extends AppCompatActivity {
Button ashok,vijay,yugal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiologist);
        ashok=findViewById(R.id.ashokbtn);
        vijay=findViewById(R.id.vijaybtn);
        yugal=findViewById(R.id.yugalbtn);
        ashok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(cardiologist.this,dr_ashok.class);
               int as=ashok.getId();
                i.putExtra("asho",as);
               startActivity(i);
               finish();
            }
        });
        vijay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cardiologist.this,dr_vijay.class);

                startActivity(i);
                finish();
            }
        });
        yugal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(cardiologist.this,dr_yukal.class);

                startActivity(i);
                finish();
            }
        });

    }
}