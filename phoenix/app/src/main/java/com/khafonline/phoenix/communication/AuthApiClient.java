package com.khafonline.phoenix.communication;

import com.khafonline.phoenix.model.CredentialData;
import com.khafonline.phoenix.model.LeoResponse;

import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AuthApiClient {
    @POST("api/auth/")
    Call<LeoResponse> login(@Body CredentialData data) ;
}
