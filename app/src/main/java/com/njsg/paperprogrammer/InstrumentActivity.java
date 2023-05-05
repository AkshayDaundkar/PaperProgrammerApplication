package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InstrumentActivity extends AppCompatActivity {
    CardView cvInstSem3,cvInstSem4,cvInstSem5,cvInstSem6,cvInstSem7,cvInstSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);

        cvInstSem3=findViewById(R.id.cvInstSem3);
        cvInstSem4=findViewById(R.id.cvInstSem4);
        cvInstSem5=findViewById(R.id.cvInstSem5);
        cvInstSem6=findViewById(R.id.cvInstSem6);
        cvInstSem7=findViewById(R.id.cvInstSem7);
        cvInstSem8=findViewById(R.id.cvInstSem8);

        cvInstSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InstrumentActivity.this,com.njsg.paperprogrammer.InstSemActivity3.class);
                startActivity(i);
            }
        });

        cvInstSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InstrumentActivity.this,com.njsg.paperprogrammer.InstSemActivity4.class);
                startActivity(i);
            }
        });

        cvInstSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InstrumentActivity.this,com.njsg.paperprogrammer.InstSemActivity5.class);
                startActivity(i);
            }
        });

        cvInstSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InstrumentActivity.this,com.njsg.paperprogrammer.InstSemActivity6.class);
                startActivity(i);
            }
        });

        cvInstSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InstrumentActivity.this,com.njsg.paperprogrammer.InstSemActivity7.class);
                startActivity(i);
            }
        });

        cvInstSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InstrumentActivity.this,com.njsg.paperprogrammer.InstSemActivity8.class);
                startActivity(i);
            }
        });


    }
}
