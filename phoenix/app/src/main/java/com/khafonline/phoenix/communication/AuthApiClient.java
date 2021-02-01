package com.khafonline.phoenix.communication;

import com.khafonline.phoenix.model.CredentialData;
import com.khafonline.phoenix.model.LeoResponse;
import com.khafonline.phoenix.model.SaveLocationData;

import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AuthApiClient {
    @POST("api/auth/")
    Call<LeoResponse> login(@Body CredentialData data) ;


    @GET("android/login/")
    Call<LeoResponse> get_csrf() ;

    @POST("authentication/save_location/")
    Call<LeoResponse> save_location(@Body SaveLocationData data) ;
}
