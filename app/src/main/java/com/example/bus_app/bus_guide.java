package com.example.bus_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class bus_guide extends FragmentActivity implements OnMapReadyCallback{
    private GoogleMap mMap;
    private Button back;
    //private Drawable drawable = this.getResources().getDrawable(R.mipmap.bus);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_guide);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
        back = findViewById(R.id.arrow_left);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bus_guide.this,line1.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoom = 17;
        // Add a marker in Sydney and move the camera
        LatLng positionnow = new LatLng(-25.43262432569038, -49.27585758310274);
        LatLng bus = new LatLng(-25.433104674478873, -49.276624126902185);
        mMap.addMarker(new MarkerOptions().position(positionnow).title("Marker in position"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(positionnow,zoom));
        //BitmapDescriptor icon= BitmapDescriptorFactory.fromBitmap(((BitmapDrawable)drawable).getBitmap());
        mMap.addMarker(new MarkerOptions().position(bus).icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_marker)));
    }
}
