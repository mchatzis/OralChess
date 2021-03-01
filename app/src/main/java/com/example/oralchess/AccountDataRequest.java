package com.example.oralchess;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class AccountDataRequest {

    public AccountDataRequest(String personal_oauth){
        this.personal_oauth = personal_oauth;
    }

    public LichessAccountData getAccountData() throws IOException{


        //Create a handler for the IRetrofit interface//
        IRetrofit retroClass = RetroClient.getRetroInstance().create(IRetrofit.class);
        Call<EmailData> serverCall = retroClass.getEmailData();

        Response<EmailData> serverResponse = serverCall.execute();

        String wait = "wait";

/*        //Execute the server request asynchronously
        serverCall.enqueue(new Callback<List<LichessAccountData>>() {

            @Override
            public void onResponse(Call<List<LichessAccountData>> call, Response<List<LichessAccountData>> response) {

            }

            @Override
            public void onFailure(Call<List<LichessAccountData>> call, Throwable t) {
                //Toast.makeText(AccountDataRequest.this, "Unable to load users", Toast.LENGTH_SHORT).show();
            }
        });*/
        return null;
    }

    private String personal_oauth;
}
