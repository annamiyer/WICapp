package cs251.vandy.principlesofsoftwareengineering;

//import android.support.v4.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.location.Criteria;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.CameraPosition;

//was extends FragmentActivity
public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LocationRequest mLocationRequest;
    private final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mLocationRequest = LocationRequest.create()
                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                .setInterval(10 * 1000)
                .setFastestInterval(1 * 1000);


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.
                ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            mMap.setMyLocationEnabled(true);
        } else{
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.
                    ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_FINE_LOCATION);
        }

        LatLng nashville = new LatLng(36.1627,86.7816);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nashville, 10.0f));

        LatLng appleMarket = new LatLng(36.057755, -86.717139);
        mMap.addMarker(new MarkerOptions().position(appleMarket).title("Marker at Apple Market"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(appleMarket));

        LatLng bellshireValPlus = new LatLng(36.266201, -86.756205);
        mMap.addMarker(new MarkerOptions().position(bellshireValPlus).title("Marker at Bellshire Value Plus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bellshireValPlus));


        LatLng billMartins = new LatLng(36.173850, -86.750144);
        mMap.addMarker(new MarkerOptions().position(billMartins).title("Marker at Bill Martins"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(billMartins));

        LatLng comptons = new LatLng(36.089303, -86.609406);
        mMap.addMarker(new MarkerOptions().position(comptons).title("Marker at Compton's Foodland"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(comptons));

        LatLng durdur = new LatLng(36.127986, -86.711134);
        mMap.addMarker(new MarkerOptions().position(durdur).title("Marker at Dur Dur International Market"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(durdur));

    }


}


