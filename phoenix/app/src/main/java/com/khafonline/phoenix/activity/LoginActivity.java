package com.khafonline.phoenix.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.khafonline.phoenix.R;
import com.khafonline.phoenix.communication.AuthApiClient;
import com.khafonline.phoenix.communication.RetrofitClientInstance;
import com.khafonline.phoenix.core.Constant;
import com.khafonline.phoenix.model.CredentialData;
import com.khafonline.phoenix.model.LeoResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_login);


        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=((EditText)findViewById(R.id.username_txt)).getText().toString();
                String passwprd=((EditText)findViewById(R.id.password_txt)).getText().toString();


            }
        });
    }



    private void login(String username,String password) {
        AuthApiClient authApiClient= RetrofitClientInstance.getRetrofitInstance().create(AuthApiClient.class);
        final Call<LeoResponse> login = authApiClient.login(new CredentialData("khafonli", "utilitarianism@123"));
        login.enqueue(new Callback<LeoResponse>() {
            @Override
            public void onResponse(Call<LeoResponse> call, Response<LeoResponse> response) {
                LeoResponse resp=response.body();
                String message=resp.getMessage();
                String result=resp.getResult();
                if (result.equals(Constant.RESULT_SUCCEED)){

                    login_ok();
                }
                if (result.equals(Constant.RESULT_FAILED)){

                    login_fail();
                }

            }

            @Override
            public void onFailure(Call<LeoResponse> call, Throwable t) {
                int a=0;
            }
        });

    }

    private void login_fail() {
        this.startActivity(new Intent(this,MainActivity.class));
    }

    private void login_ok() {
    }

}
