package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class station2 extends AppCompatActivity {
    private Button back, text, map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station2);
        text = findViewById(R.id.Button_bus_informa);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(station2.this, station1.class);
                startActivity(intent1);
            }
        });
        back = findViewById(R.id.arrow_left);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(station2.this, MainActivity.class);
                startActivity(intent2);
            }
        });
        map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(station2.this, bus_guide.class);
                startActivity(intent3);
            }
        });
    }
}
