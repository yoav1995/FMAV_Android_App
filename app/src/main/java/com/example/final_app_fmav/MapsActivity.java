package com.example.final_app_fmav;

import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.final_app_fmav.Models.LocationDetails;
import com.example.final_app_fmav.Utilities.DataManager;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private final int FINE_PERMISSION_CODE = 1;
    SupportMapFragment supportMapFragment;
    Location currentLocation;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        getLastLocation();

    }


    private void getLastLocation() {

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},FINE_PERMISSION_CODE);
            return;
        }
        Task<Location> task = fusedLocationProviderClient.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location!=null)
                {
                    currentLocation=location;

                    // Obtain the SupportMapFragment and get notified when the map is ready to be used.
                    SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                            .findFragmentById(R.id.map);
                    mapFragment.getMapAsync(MapsActivity.this);

                }
            }
        });
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //insert cars and bikes agencies locations on map for users comfort
        ArrayList<LocationDetails> locationDetailsLst= DataManager.getLocationsDet();
        for(LocationDetails locationDetails: locationDetailsLst)
        {
            insertLocations(locationDetails.getLat(), locationDetails.getLng(),locationDetails.getTitle(),mMap);
        }

        // set current location
        LatLng currentResultLocation = new LatLng(currentLocation.getLatitude(),currentLocation.getLongitude());
        mMap.addMarker(new MarkerOptions().position(currentResultLocation).title("My Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(currentResultLocation));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentResultLocation, 15));
        mMap.addMarker(new MarkerOptions().position(currentResultLocation).title("My Location"));
    }

    private void insertLocations(double lat,double lng,String name, GoogleMap mMap) {
        LatLng coordinates= new LatLng(lat,lng);
        mMap.addMarker(new MarkerOptions().position(coordinates).title(name));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==FINE_PERMISSION_CODE){
            if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                getLastLocation();
            }else{
                Toast.makeText(this,"Location permissions is denied",Toast.LENGTH_SHORT).show();
            }

        }
    }


}