package com.example.fetchingdatafromjson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonData {

    @GET("hiring.json")
    Call<List<Post>> getPosts();
}
