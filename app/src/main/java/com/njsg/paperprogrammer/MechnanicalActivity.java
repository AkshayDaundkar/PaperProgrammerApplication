package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MechnanicalActivity extends AppCompatActivity {
CardView cvMechSem3,cvMechSem4,cvMechSem5,cvMechSem6,cvMechSem7,cvMechSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechnanical);
        cvMechSem3=findViewById(R.id.cvMechSem3);
        cvMechSem4=findViewById(R.id.cvMechSem4);
        cvMechSem5=findViewById(R.id.cvMechSem5);
        cvMechSem6=findViewById(R.id.cvMechSem6);
        cvMechSem7=findViewById(R.id.cvMechSem7);
        cvMechSem8=findViewById(R.id.cvMechSem8);


        cvMechSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MechnanicalActivity.this,com.njsg.paperprogrammer.MechSemActivity3.class);
                startActivity(i);
            }
        });

        cvMechSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MechnanicalActivity.this,com.njsg.paperprogrammer.MechSemActivity4.class);
                startActivity(i);
            }
        });

        cvMechSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MechnanicalActivity.this,com.njsg.paperprogrammer.MechSemActivity5.class);
                startActivity(i);
            }
        });

        cvMechSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MechnanicalActivity.this,com.njsg.paperprogrammer.MechSemActivity6.class);
                startActivity(i);
            }
        });

        cvMechSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MechnanicalActivity.this,com.njsg.paperprogrammer.MechSemActivity7.class);
                startActivity(i);
            }
        });

        cvMechSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MechnanicalActivity.this,com.njsg.paperprogrammer.MechSemActivity8.class);
                startActivity(i);
            }
        });

    }
}
