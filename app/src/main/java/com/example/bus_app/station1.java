package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class station1 extends AppCompatActivity {
    private Button back, text,line1a,line1b,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statoin1);
        text = findViewById(R.id.Button_populartime);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(station1.this, station2.class);
                startActivity(intent1);
            }
        });
        back = findViewById(R.id.arrow_left);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(station1.this, MainActivity.class);
                startActivity(intent2);
            }
        });
        line1a = findViewById(R.id.Button_bus1);
        line1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(station1.this, line1.class);
                startActivity(intent2);
            }
        });
        line1b = findViewById(R.id.Button_bus3);
        line1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(station1.this, line1.class);
                startActivity(intent3);
            }
        });
        map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(station1.this, bus_guide.class);
                startActivity(intent4);
            }
        });
    }
}
