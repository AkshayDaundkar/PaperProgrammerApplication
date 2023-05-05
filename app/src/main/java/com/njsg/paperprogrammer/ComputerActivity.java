package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComputerActivity extends AppCompatActivity {
        CardView cvCompSem3,cvCompSem4,cvCompSem5,cvCompSem6,cvCompSem7,cvCompSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        cvCompSem3=findViewById(R.id.cvCompSem3);
        cvCompSem4=findViewById(R.id.cvCompSem4);
        cvCompSem5=findViewById(R.id.cvCompSem5);
        cvCompSem6=findViewById(R.id.cvCompSem6);
        cvCompSem7=findViewById(R.id.cvCompSem7);
        cvCompSem8=findViewById(R.id.cvCompSem8);


        cvCompSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ComputerActivity.this,com.njsg.paperprogrammer.ComplSemActivity3.class);
                startActivity(i);
            }
        });


        cvCompSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ComputerActivity.this,com.njsg.paperprogrammer.ComplSemActivity4.class);
                startActivity(i);
            }
        });

        cvCompSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ComputerActivity.this,com.njsg.paperprogrammer.ComplSemActivity5.class);
                startActivity(i);
            }
        });

        cvCompSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ComputerActivity.this,com.njsg.paperprogrammer.ComplSemActivity6.class);
                startActivity(i);
            }
        });

        cvCompSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ComputerActivity.this,com.njsg.paperprogrammer.ComplSemActivity7.class);
                startActivity(i);
            }
        });

        cvCompSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ComputerActivity.this,com.njsg.paperprogrammer.ComplSemActivity8.class);
                startActivity(i);
            }
        });
    }
}
