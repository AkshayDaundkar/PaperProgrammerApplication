package com.njsg.paperprogrammer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
        CardView cvFSem1,cvFSem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        cvFSem1=findViewById(R.id.cvFSem1);
        cvFSem2=findViewById(R.id.cvFSem2);


        cvFSem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,com.njsg.paperprogrammer.FirstSubjectsActivity.class);
                startActivity(intent);
            }
        });

        cvFSem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,com.njsg.paperprogrammer.FirstSubjects2Activity.class);
                startActivity(intent);
            }
        });
    }
}
