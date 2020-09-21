package com.khafonline.phoenix.interfaces;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    public WebAppInterface(Context context) {
        mContext = context;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public String showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
        return "Hiiii Hossein!!!!!!";
    }
}