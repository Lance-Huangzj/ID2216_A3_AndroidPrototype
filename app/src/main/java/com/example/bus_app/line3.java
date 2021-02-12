package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class line3 extends AppCompatActivity {
    private Button back, station,mainpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line3);
        back = findViewById(R.id.arrow_left);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(line3.this,line_total2.class);
                startActivity(intent);
            }
        });
        station = findViewById(R.id.station_1);
        station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(line3.this,station1.class);
                startActivity(intent2);
            }
        });
        mainpage = findViewById(R.id.mainpage);
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(line3.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}
