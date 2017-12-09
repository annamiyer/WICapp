package cs251.vandy.principlesofsoftwareengineering;

/**
 * Created by peachesmemishian on 12/6/17.
 */

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public abstract class UISettings extends AppCompatActivity implements OnMapReadyCallback {
    /** private GoogleMap mMap;

    private UiSettings mUiSettings;

     /**
         * Returns whether the checkbox with the given id is checked.

    private boolean isChecked(int id) {
        return ((CheckBox) findViewById(id)).isChecked();
    }

    @Override
    public void onMapReady(GoogleMap map) {

        mMap = map;
        mUiSettings = mMap.getUiSettings();

        // Keep the UI Settings state in sync with the checkboxes.
        mUiSettings.setZoomControlsEnabled(isChecked(R.id.zoom_buttons_toggle));
        mUiSettings.setCompassEnabled(isChecked(R.id.compass_toggle));
        mUiSettings.setScrollGesturesEnabled(isChecked(R.id.scroll_toggle));
        mUiSettings.setZoomGesturesEnabled(isChecked(R.id.zoom_gestures_toggle));
        mUiSettings.setRotateGesturesEnabled(isChecked(R.id.rotate_toggle));
    }

    //adds the +/- zoom control buttons at the bottom of the map
    public void setZoomButtonsEnabled(View v) {
        if (!checkReady()) {
            return;
        }
        mUiSettings.setZoomControlsEnabled(((CheckBox) v).isChecked());
    }


    //adds the compas icon at the top of the screen to orient the map
    public void setCompassEnabled(View v) {
        if (!checkReady()) {
            return;
        }
        mUiSettings.setCompassEnabled(((CheckBox) v).isChecked());
    }


    //allows scrolling/panning the map
    public void setScrollGesturesEnabled(View v) {
        if (!checkReady()) {
            return;
        }
        mUiSettings.setScrollGesturesEnabled(((CheckBox) v).isChecked());
    }


    //allows zoom gestures like pinching and stretching
    public void setZoomGesturesEnabled(View v) {
        if (!checkReady()) {
            return;
        }
        mUiSettings.setZoomGesturesEnabled(((CheckBox) v).isChecked());
    }



    //allows rotate gestures
    public void setRotateGesturesEnabled(View v) {
        if (!checkReady()) {
            return;
        }
        mUiSettings.setRotateGesturesEnabled(((CheckBox) v).isChecked());
    }

    */
}
