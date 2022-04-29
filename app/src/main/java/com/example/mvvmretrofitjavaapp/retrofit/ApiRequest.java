package com.example.mvvmretrofitjavaapp.retrofit;

import static com.example.mvvmretrofitjavaapp.constants.AppConstant.API_KEY;

import com.example.mvvmretrofitjavaapp.response.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("top-headlines?country=ru&apiKey=" + API_KEY)
    Call<ArticleResponse> getTopHeadlines();
}
