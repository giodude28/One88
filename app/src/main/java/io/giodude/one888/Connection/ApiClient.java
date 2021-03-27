package io.giodude.one888.Connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static ApiInterface retrofitBuilder(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.Past_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }

    public static ApiInterface retrofitBuilderLive(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.Live_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }

    public static ApiInterface retrofitBuilderPlayer(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.PLAYER_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }
    public static ApiInterface retrofitBuilderTeam(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.TEAM_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }
}
