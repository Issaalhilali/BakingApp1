package com.example.bakingapp.network;

import com.example.bakingapp.data.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface Service {

    @GET("baking.json")
    Call<List<Recipe>> getRecipes();

}

