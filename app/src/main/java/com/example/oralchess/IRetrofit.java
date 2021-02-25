package com.example.oralchess;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface IRetrofit {

    @GET("/account")
    Call<List<LichessAccountData>> getAllPosts();

/*

    @GET("users/{user}/repos")
    Call<List<RetroPosts>> listRepos(@Path("user") String user);
*/

}
