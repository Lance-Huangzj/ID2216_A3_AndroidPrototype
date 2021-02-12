package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class line_total2 extends AppCompatActivity {
    private Button line1,line2,line3,mainpage,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linetotal2);
        back = findViewById(R.id.back);
        mainpage = findViewById(R.id.mainpage);
        line1 = findViewById(R.id.transparent1_label);
        line2 = findViewById(R.id.transparent2_label);
        line3 = findViewById(R.id.transparent3_label);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(line_total2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(line_total2.this,MainActivity.class);
                startActivity(intent2);
            }
        });
        line1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(line_total2.this,line3.class);
                startActivity(intent3);
            }
        });
        line2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(line_total2.this,line3.class);
                startActivity(intent4);
            }
        });
        line3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(line_total2.this,line3.class);
                startActivity(intent5);
            }
        });
    }
}
