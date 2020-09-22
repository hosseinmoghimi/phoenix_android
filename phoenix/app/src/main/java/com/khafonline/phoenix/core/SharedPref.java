package com.khafonline.phoenix.core;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;
//
//import com.khafonline.genesis.auth.AuthCheck;

import com.khafonline.phoenix.volley.MyApplication;

import java.util.PriorityQueue;

/**
 * Created by Hossein on 15/03/2019.
 */


public class SharedPref {
    private static final String RememberedUsername="RememberedUsername";
    private static final String RememberedPassword="RememberedPassword";


    //region Set & Get


    private static boolean getBoolean(String keyName, boolean defaultVlaue) {
        SharedPreferences sharedPreferences = MyApplication.getAppContext().getSharedPreferences(Constant.SHAREDPREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(keyName, defaultVlaue);
    }

    private static void setBoolean(String keyName, boolean keyValue) {

        SharedPreferences sharedPref = MyApplication.getAppContext().getSharedPreferences(Constant.SHAREDPREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(keyName, keyValue);
        editor.apply();
    }

    private static String getString(String keyName) {
        SharedPreferences sharedPreferences = MyApplication.getAppContext().getSharedPreferences(Constant.SHAREDPREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(keyName, "");
    }

    private static void setString(String keyName, String keyValue) {

        SharedPreferences sharedPref = MyApplication.getAppContext().getSharedPreferences(Constant.SHAREDPREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(keyName, keyValue);
        editor.apply();
    }

    private static int getInt(String keyName) {
        SharedPreferences sharedPreferences = MyApplication.getAppContext().getSharedPreferences(Constant.SHAREDPREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(keyName, 0);
    }

    private static void setInt(String keyName, int keyValue) {

        SharedPreferences sharedPref = MyApplication.getAppContext().getSharedPreferences(Constant.SHAREDPREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(keyName, keyValue);
        editor.apply();
    }

    //endregion


    public static boolean getFirstNameFirst() {
        return getBoolean(Constant.SHAREDPREF_FIRST_NAME_FIRST, true);
    }

    public static void setFirstNameFirst(boolean firstNameFirst) {
        setBoolean(Constant.SHAREDPREF_FIRST_NAME_FIRST, firstNameFirst);
    }


    public static boolean isFirstRun() {
        return getBoolean(Constant.SHAREDPREF_FIRST_RUN, true);
    }

    public static void setFirstRun(boolean firstNameFirst) {
        setBoolean(Constant.SHAREDPREF_FIRST_RUN, firstNameFirst);
    }


    public static String getServerAddress() {
        return getString(Constant.SHAREDPREF_SERVER_ADDRESS);
    }

    public static void setServerAddress(String serverAddress) {
        setString(Constant.SHAREDPREF_SERVER_ADDRESS, serverAddress);
    }






    public static void setProfileImage(String image) {
        setString(Constant.SHAREDPREF_USER_IMAGE, image);
    }


    public static void setRememberedUsername(String username) {
        setString( RememberedUsername,username);
    }

    public static String getRememberedUsername() {
        return getString(RememberedUsername);
    }


    public static void setRememberedPassword(String password) {
        setString( RememberedPassword,password);
    }

    public static String getRememberedPassword() {
        return getString(RememberedPassword);
    }

}

