package com.khafonline.phoenix.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


import com.khafonline.phoenix.volley.MyApplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Core {
    public static void addLog(String s) {
    }

    public static void isfirstRun() {
        if(SharedPref.isFirstRun()) {

            SharedPref.setFirstRun(false);
        }

    }

    public static void startRun(Context context) {

        isfirstRun();

    }




}