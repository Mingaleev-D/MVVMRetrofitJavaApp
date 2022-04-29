package com.example.mvvmretrofitjavaapp.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmretrofitjavaapp.repository.ArticleRepository;
import com.example.mvvmretrofitjavaapp.response.ArticleResponse;

public class ArticleViewModel extends AndroidViewModel {
    private ArticleRepository articleRepository;
    private MutableLiveData<ArticleResponse> articleRepositoryLiveData;

    public ArticleViewModel(@NonNull Application application) {
        super(application);

        articleRepository = new  ArticleRepository();
        this.articleRepositoryLiveData = articleRepository.getDashBoardNews();
    }
    public  LiveData<ArticleResponse> getBashboardNewResponseLiveData() {
        return articleRepositoryLiveData;
    }
}
