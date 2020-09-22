package com.khafonline.phoenix.communication;


import com.khafonline.phoenix.core.Constant;

import retrofit2.Retrofit;


public class RetrofitClientInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = Constant.DATA_SERVER_ADDRESS;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
