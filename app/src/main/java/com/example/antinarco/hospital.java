package com.example.antinarco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hospital extends AppCompatActivity {
public ImageView cardio,neph,neuro,rehab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        cardio=findViewById(R.id.Cardio);
        neph=findViewById(R.id.Nephrologist);
        neuro=findViewById(R.id.Neurologist);
//        rehab=findViewById(R.id.Rehabilitat);

        cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(hospital.this,cardiologist.class);
                startActivity(i);
                finish();
            }
        });
        neph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(hospital.this,nephrologist.class);
                startActivity(i);
                finish();
            }
        });
        neuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(hospital.this,neurologist.class);
                startActivity(i);
                finish();
            }
        });
//        rehab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(hospital.this,rehabilitation.class);
//                startActivity(i);
//                finish();
//            }
//        });
    }
}