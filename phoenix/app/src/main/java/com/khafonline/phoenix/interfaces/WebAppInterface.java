package com.khafonline.phoenix.interfaces;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.khafonline.phoenix.utility.LocationFinder;

public class WebAppInterface {
    Context mContext;

    /**
     * Instantiate the interface and set the context
     */
    public WebAppInterface(Context context) {
        mContext = context;
    }

    /**
     * Show a toast from the web page
     */
    @JavascriptInterface
    public String showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
        return "Hiiii Hossein!!!!!!";
    }



    @JavascriptInterface
    public String getLocation() {
        LocationFinder finder;
        double longitude = 0.0, latitude = 0.0;
        finder = new LocationFinder(mContext);
        if (finder.canGetLocation()) {
            latitude = finder.getLatitude();
            longitude = finder.getLongitude();
            //Toast.makeText(mContext, "lat-lng " + latitude + " — " + longitude, Toast.LENGTH_LONG).show();
            return "{\"latitude\":\"" + String.valueOf(latitude) + "\",\"longitude\":\"" + String.valueOf(longitude) + "\"}";
        } else {
            finder.showSettingsAlert();
        }
        return "{'latitude':0,'longitude':0}";
    }

}