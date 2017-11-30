package cs251.vandy.principlesofsoftwareengineering;

//import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//was extends FragmentActivity
public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

   // private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
       // mMap = googleMap;

        LatLng appleMarket = new LatLng(36.057755, -86.717139);
        googleMap.addMarker(new MarkerOptions().position(appleMarket).title("Marker at Apple Market"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(appleMarket));

        /**LatLng bellshireValPlus = new LatLng(36.266201, -86.756205);
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
         **/
    }
}


/**


 package com.example.currentplacedetailsonmap;

 import android.content.DialogInterface;
 import android.content.pm.PackageManager;
 import android.location.Location;
 import android.os.Bundle;
 import android.support.annotation.NonNull;
 import android.support.v4.app.ActivityCompat;
 import android.support.v4.content.ContextCompat;
 import android.support.v7.app.AlertDialog;
 import android.support.v7.app.AppCompatActivity;
 import android.util.Log;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.view.View;
 import android.widget.FrameLayout;
 import android.widget.TextView;

 import com.google.android.gms.location.FusedLocationProviderClient;
 import com.google.android.gms.location.LocationServices;
 import com.google.android.gms.location.places.GeoDataClient;
 import com.google.android.gms.location.places.PlaceDetectionClient;
 import com.google.android.gms.location.places.PlaceLikelihood;
 import com.google.android.gms.location.places.PlaceLikelihoodBufferResponse;
 import com.google.android.gms.location.places.Places;
 import com.google.android.gms.maps.CameraUpdateFactory;
 import com.google.android.gms.maps.GoogleMap;
 import com.google.android.gms.maps.OnMapReadyCallback;
 import com.google.android.gms.maps.SupportMapFragment;
 import com.google.android.gms.maps.model.CameraPosition;
 import com.google.android.gms.maps.model.LatLng;
 import com.google.android.gms.maps.model.Marker;
 import com.google.android.gms.maps.model.MarkerOptions;
 import com.google.android.gms.tasks.OnCompleteListener;
 import com.google.android.gms.tasks.Task;

 public class MapsActivityCurrentPlace extends AppCompatActivity
 implements OnMapReadyCallback {

 private static final String TAG = MapsActivityCurrentPlace.class.getSimpleName();
 private GoogleMap mMap;
 private CameraPosition mCameraPosition;

 // The entry points to the Places API.
 private GeoDataClient mGeoDataClient;
 private PlaceDetectionClient mPlaceDetectionClient;

 // The entry point to the Fused Location Provider.
 private FusedLocationProviderClient mFusedLocationProviderClient;

 // A default location of Nashville, TN and default zoom to use when location permission is
 // not granted.
 private final LatLng mDefaultLocation = new LatLng(36.1627, 86.7816);
 private static final int DEFAULT_ZOOM = 15;
 private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
 private boolean mLocationPermissionGranted;

 // The geographical location where the device is currently located. That is, the last-known
 // location retrieved by the Fused Location Provider.
 private Location mLastKnownLocation;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);


     // Retrieve location and camera position from saved instance state.
    if (savedInstanceState != null) {
        mLastKnownLocation = savedInstanceState.getParcelable(KEY_LOCATION);
        mCameraPosition = savedInstanceState.getParcelable(KEY_CAMERA_POSITION);
    }

    // Retrieve the content view that renders the map.
    setContentView(R.layout.activity_maps);

    // Construct a GeoDataClient.
    mGeoDataClient = Places.getGeoDataClient(this, null);

    // Construct a FusedLocationProviderClient.
    mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

 }

 }







 **/