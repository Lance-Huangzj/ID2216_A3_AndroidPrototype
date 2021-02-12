package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class line1 extends AppCompatActivity {
    private Button back, exchange, mainpage, station,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line1);
        back = findViewById(R.id.arrow_left);
        exchange = findViewById(R.id.line_exchange);
        mainpage = findViewById(R.id.mainpage);
        station = findViewById(R.id.station_1);
        map = findViewById(R.id.bus_locaiton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(line1.this, line_total2.class);
                startActivity(intent1);
            }
        });
        exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(line1.this, line2.class);
                startActivity(intent2);
            }
        });
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(line1.this, MainActivity.class);
                startActivity(intent3);
            }
        });
        station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(line1.this, station1.class);
                startActivity(intent4);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(line1.this, bus_guide.class);
                startActivity(intent5);
            }
        });
    }
}
