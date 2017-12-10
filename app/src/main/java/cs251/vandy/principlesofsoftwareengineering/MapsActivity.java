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
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

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
        mMap.addMarker(new MarkerOptions().position(appleMarket).title("Apple Market #40")
                .snippet("Address: 5127 Nolensville Pike, Phone Number: 833-6256")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(appleMarket));

        LatLng bellshireValPlus = new LatLng(36.266201, -86.756205);
        mMap.addMarker(new MarkerOptions().position(bellshireValPlus).title("Bellshire Valu-Plus")
                .snippet("Address: 3839 Dickerson Pike, Phone number: 868-1002")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bellshireValPlus));


        LatLng billMartins = new LatLng(36.173850, -86.750144);
        mMap.addMarker(new MarkerOptions().position(billMartins).title("Bill Martins Cee-Bee")
                .snippet("Address: 221 South 11th Street, Phone Number: 228-8971")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(billMartins));

        LatLng comptons = new LatLng(36.089303, -86.609406);
        mMap.addMarker(new MarkerOptions().position(comptons).title("Compton's Foodland")
                .snippet("Address: 2808 Smith Springs Road, Phone Number: 367-0082")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(comptons));

        LatLng durdur = new LatLng(36.127986, -86.711134);
        mMap.addMarker(new MarkerOptions().position(durdur).title("Dur Dur International Market")
                .snippet("Address: 1080-A Murfreesboro Pike, Phone Number: 360-7822")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(durdur));

        LatLng eddies = new LatLng(35.464451, -86.467451);
        mMap.addMarker(new MarkerOptions().position(eddies).title("Eddie's Cee-Bee")
                .snippet("Address: 109 Lafayette Street, Phone Number: 244-1132")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eddies));

        LatLng bordeaux = new LatLng(36.197266, -86.836915);
        mMap.addMarker(new MarkerOptions().position(bordeaux).title("Bordeaux Foodland")
                .snippet("Address: 3205 Clarksville Highway, Phone Number: 254-6384")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bordeaux));

        LatLng goldStar = new LatLng(36.130249, -86.714917);
        mMap.addMarker(new MarkerOptions().position(goldStar).title("Gold Star Market")
                .snippet("Address: 974 Murfreesboro Pike, Phone Number: 678-6939")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(goldStar));

        LatLng kwikStop = new LatLng(36.251663, -86.716270);
        mMap.addMarker(new MarkerOptions().position(kwikStop).title("Kwik Stop 2")
                .snippet("Address: 201 E. Webster St, Phone Number: 865-9882")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kwikStop));

        LatLng latinoMerc = new LatLng(36.084040, -86.703006);
        mMap.addMarker(new MarkerOptions().position(latinoMerc).title("Latino Super Mercado")
                .snippet("Address: 219 Largo Drive, Phone Number: 834-3385")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latinoMerc));

        LatLng LnE = new LatLng(36.129970, -86.713625);
        mMap.addMarker(new MarkerOptions().position(LnE).title("L&E Market")
                .snippet("Address: 606 Millwood Drive, Phone Number: 360-8000")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LnE));

        LatLng mexicana = new LatLng(36.129106, -86.714781);
        mMap.addMarker(new MarkerOptions().position(mexicana).title("La Mexicana Market")
                .snippet("Address: 989 Murfreesboro Pike, Phone Number: 366-2992")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mexicana));

    }


}


