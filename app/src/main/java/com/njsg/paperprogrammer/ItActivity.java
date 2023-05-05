package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItActivity extends AppCompatActivity {

    CardView cvItSem3,cvItSem4,cvItSem5,cvItSem6,cvItSem7,cvItSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        cvItSem3=findViewById(R.id.cvItSem3);
        cvItSem4=findViewById(R.id.cvItSem4);
        cvItSem5=findViewById(R.id.cvItSem5);
        cvItSem6=findViewById(R.id.cvItSem6);
        cvItSem7=findViewById(R.id.cvItSem7);
        cvItSem8=findViewById(R.id.cvItSem8);

        cvItSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ItActivity.this,com.njsg.paperprogrammer.ItSemActivity3.class);
                startActivity(i);
            }
        });

        cvItSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ItActivity.this,com.njsg.paperprogrammer.ItSemActivity4.class);
                startActivity(i);
            }
        });

        cvItSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ItActivity.this,com.njsg.paperprogrammer.ItSemActivity5.class);
                startActivity(i);
            }
        });

        cvItSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ItActivity.this,com.njsg.paperprogrammer.ItSemActivity6.class);
                startActivity(i);
            }
        });

        cvItSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ItActivity.this,com.njsg.paperprogrammer.ItSemActivity7.class);
                startActivity(i);
            }
        });

        cvItSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ItActivity.this,com.njsg.paperprogrammer.ItSemActivity8.class);
                startActivity(i);
            }
        });
    }
}
