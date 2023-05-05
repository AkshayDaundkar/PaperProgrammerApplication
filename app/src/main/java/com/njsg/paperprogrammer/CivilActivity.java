package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CivilActivity extends AppCompatActivity {
CardView cvCivilSem3,cvCivilSem4,cvCivilSem5,cvCivilSem6,cvCivilSem7,cvCivilSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        cvCivilSem3=findViewById(R.id.cvCivilSem3);
        cvCivilSem4=findViewById(R.id.cvCivilSem4);
        cvCivilSem5=findViewById(R.id.cvCivilSem5);
        cvCivilSem6=findViewById(R.id.cvCivilSem6);
        cvCivilSem7=findViewById(R.id.cvCivilSem7);
        cvCivilSem8=findViewById(R.id.cvCivilSem8);

        cvCivilSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CivilActivity.this,com.njsg.paperprogrammer.CivilSemActivity3.class);
                startActivity(i);
            }
        });

        cvCivilSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(CivilActivity.this,com.njsg.paperprogrammer.CivilSemActivity4.class);
                startActivity(c);
            }
        });

        cvCivilSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CivilActivity.this,com.njsg.paperprogrammer.CivilSemActivity5.class);
                startActivity(i);
            }
        });

        cvCivilSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CivilActivity.this,com.njsg.paperprogrammer.CivilSemActivity6.class);
                startActivity(i);
            }
        });

        cvCivilSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CivilActivity.this,com.njsg.paperprogrammer.CivilSemActivity7.class);
                startActivity(i);
            }
        });

        cvCivilSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CivilActivity.this,com.njsg.paperprogrammer.CivilSemActivity8.class);
                startActivity(i);
            }
        });

    }
}
