package com.example.bakingapp.network;

import com.example.bakingapp.data.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private static final String URL =
            "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/";
    private static Retrofit sRetrofit = new Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static Service sService = sRetrofit.create(Service.class);

    public static Call<List<Recipe>> buildRecipeListCall() {
        Call<List<Recipe>> call = sService.getRecipes();
        return call;
    }
}