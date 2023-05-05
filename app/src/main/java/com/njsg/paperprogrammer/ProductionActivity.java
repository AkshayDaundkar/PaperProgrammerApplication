package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProductionActivity extends AppCompatActivity {
CardView cvProdSem3,cvProdSem4,cvProdSem5,cvProdSem6,cvProdSem7,cvProdSem8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production);

        cvProdSem3=findViewById(R.id.cvProdSem3);
        cvProdSem4=findViewById(R.id.cvProdSem4);
        cvProdSem5=findViewById(R.id.cvProdSem5);
        cvProdSem6=findViewById(R.id.cvProdSem6);
        cvProdSem7=findViewById(R.id.cvProdSem7);
        cvProdSem8=findViewById(R.id.cvProdSem8);


        cvProdSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProductionActivity.this,com.njsg.paperprogrammer.ProductionSemActivity3.class);
                startActivity(i);
            }
        });

        cvProdSem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProductionActivity.this,com.njsg.paperprogrammer.ProductionSemActivity4.class);
                startActivity(i);
            }
        });

        cvProdSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProductionActivity.this,com.njsg.paperprogrammer.ProductionSemActivity5.class);
                startActivity(i);
            }
        });

        cvProdSem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProductionActivity.this,com.njsg.paperprogrammer.ProductionSemActivity6.class);
                startActivity(i);
            }
        });

        cvProdSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProductionActivity.this,com.njsg.paperprogrammer.ProductionSemActivity7.class);
                startActivity(i);
            }
        });

        cvProdSem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ProductionActivity.this,com.njsg.paperprogrammer.ProductionSemActivity8.class);
                startActivity(i);
            }
        });

    }
}