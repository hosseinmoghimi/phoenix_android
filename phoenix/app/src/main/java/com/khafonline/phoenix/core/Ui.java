package com.khafonline.phoenix.core;


import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;

import com.khafonline.phoenix.R;

public class Ui {



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void changeToolbarFont(Toolbar toolbar, Activity context) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View view = toolbar.getChildAt(i);
            if (view instanceof TextView) {
                TextView tv = (TextView) view;
                if (tv.getText().equals(toolbar.getTitle())) {
                    applyFont(tv, context);
                    break;
                }
            }
        }
    }

    public static void applyFont(View view, Activity context) {
        if (view instanceof TextView) {
            ((TextView)view).setTypeface(Typeface.createFromAsset(context.getAssets(), Constant.DEFAULT_FONT_FOLDER + Constant.fonts[Constant.fonts.length - 1]));
        }

        if (view instanceof Button) {
            ((Button)view).setTypeface(Typeface.createFromAsset(context.getAssets(), Constant.DEFAULT_FONT_FOLDER + Constant.fonts[Constant.fonts.length - 1]));
        }

        if (view instanceof EditText) {
            ((EditText)view).setTypeface(Typeface.createFromAsset(context.getAssets(), Constant.DEFAULT_FONT_FOLDER + Constant.fonts[Constant.fonts.length - 1]));
        }
    }

    public static void applyMenuFont(MenuItem viewById, Activity context) {
        if(viewById!=null)
            applyFont(viewById.getActionView(),context);
    }
}
