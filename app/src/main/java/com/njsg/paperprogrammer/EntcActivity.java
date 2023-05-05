package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EntcActivity extends AppCompatActivity {

    CardView cvEntcSem3,cvEntcSem4,cvEntcSem5,cvEntcSem6,cvEntcSem7,cvEntcSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entc);

        cvEntcSem3=findViewById(R.id.cvEntcSem3);
        cvEntcSem4=findViewById(R.id.cvEntcSem4);
        cvEntcSem5=findViewById(R.id.cvEntcSem5);
        cvEntcSem6=findViewById(R.id.cvEntcSem6);
        cvEntcSem7=findViewById(R.id.cvEntcSem7);
        cvEntcSem8=findViewById(R.id.cvEntcSem8);

        cvEntcSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EntcActivity.this,com.njsg.paperprogrammer.EntcSemActivity3.class);
                startActivity(i);
            }
        });

        cvEntcSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EntcActivity.this,com.njsg.paperprogrammer.EntcSemActivity4.class);
                startActivity(i);
            }
        });

        cvEntcSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EntcActivity.this,com.njsg.paperprogrammer.EntcSemActivity5.class);
                startActivity(i);
            }
        });

        cvEntcSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EntcActivity.this,com.njsg.paperprogrammer.EntcSemActivity6.class);
                startActivity(i);
            }
        });

        cvEntcSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EntcActivity.this,com.njsg.paperprogrammer.EntcSemActivity7.class);
                startActivity(i);
            }
        });

        cvEntcSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EntcActivity.this,com.njsg.paperprogrammer.EntcSemActivity8.class);
                startActivity(i);
            }
        });


    }
}
