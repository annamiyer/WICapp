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

        LatLng bellshireValPlus = new LatLng(36.266201, -86.756205);
         googleMap.addMarker(new MarkerOptions().position(bellshireValPlus).title("Marker at Bellshire Value Plus"));
         googleMap.moveCamera(CameraUpdateFactory.newLatLng(bellshireValPlus));


         LatLng billMartins = new LatLng(36.173850, -86.750144);
         googleMap.addMarker(new MarkerOptions().position(billMartins).title("Marker at Bill Martins"));
         googleMap.moveCamera(CameraUpdateFactory.newLatLng(billMartins));

         LatLng comptons = new LatLng(36.089303, -86.609406);
         googleMap.addMarker(new MarkerOptions().position(comptons).title("Marker at Compton's Foodland"));
         googleMap.moveCamera(CameraUpdateFactory.newLatLng(comptons));

         LatLng durdur = new LatLng(36.127986, -86.711134);
         googleMap.addMarker(new MarkerOptions().position(durdur).title("Marker at Dur Dur International Market"));
         googleMap.moveCamera(CameraUpdateFactory.newLatLng(durdur));

    }
}


