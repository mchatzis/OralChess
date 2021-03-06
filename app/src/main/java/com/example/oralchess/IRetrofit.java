package com.example.oralchess;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface IRetrofit {

    @GET("account")
    Call<String> getAccountData();

    @GET("account/email")
    Call<EmailData> getEmailData();

    @GET("posts")
    Call<List<Posts>> getPosts();

/*

    @GET("users/{user}/repos")
    Call<List<RetroPosts>> listRepos(@Path("user") String user);
*/

}
