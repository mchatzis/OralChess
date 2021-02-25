package com.example.oralchess;

import android.widget.Toast;
import retrofit2.Call;

import java.util.List;

public class AccountDataRequest {

    public AccountDataRequest(String personal_oauth){
        this.personal_oauth = personal_oauth;
    }

    public LichessAccountData getAccountData(){

        //Create a handler for the IRetrofit interface//
        IRetrofit retroClass = RetroClient.getRetroInstance().create(IRetrofit.class);
        Call<List<LichessAccountData>> serverCall = retroClass.getAllPosts();

        //Execute the server request asynchronously
        serverCall.enqueue(new Callback<List<RetroPosts>>() {

            @Override
            public void onResponse(Call<List<RetroPosts>> call, Response<List<RetroPosts>> response) {

            }

            @Override
            public void onFailure(Call<List<RetroPosts>> call, Throwable t) {
                Toast.makeText(LogIn.this, "Unable to load users", Toast.LENGTH_SHORT).show();
            }
        });
        return null;
    }
    private String personal_oauth;
}
