package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback  {
    private Button text2, stationa1, stationa2,stationa3,lines;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
         text2 = findViewById(R.id.title_text_2);
         text2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                 overridePendingTransition(android.R.anim.fade_out,0);
                 startActivity(intent);
             }
         });
         stationa1 = findViewById(R.id.to_station_a_1);
         stationa2 = findViewById(R.id.to_station_a_2);
         stationa3 = findViewById(R.id.to_station_a_3);
         stationa1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intenta1 = new Intent(MainActivity.this, station1.class);
                 overridePendingTransition(android.R.anim.fade_out,0);
                 startActivity(intenta1);
             }
         });
         stationa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta2 = new Intent(MainActivity.this, station1.class);
                overridePendingTransition(android.R.anim.fade_out,0);
                startActivity(intenta2);
            }
         });
         stationa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta3 = new Intent(MainActivity.this, station1.class);
                overridePendingTransition(android.R.anim.fade_out,0);
                startActivity(intenta3);
            }
         });
         lines = findViewById(R.id.line);
         lines.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent2 = new Intent(MainActivity.this, line_total2.class);
                 overridePendingTransition(android.R.anim.fade_out,0);
                 startActivity(intent2);
             }
         });
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng positionnow = new LatLng(-25.43262432569038, -49.27585758310274);
        mMap.addMarker(new MarkerOptions().position(positionnow).title("Marker in position"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(positionnow,17));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}


