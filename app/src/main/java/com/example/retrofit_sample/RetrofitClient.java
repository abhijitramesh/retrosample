package com.example.retrofit_sample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    /**
     * Defining the BASE_URL to perform the https request
     */
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    /**
     * Creating a Retrofit instance
     */
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)

                    //adding the converter//

            .addConverterFactory(GsonConverterFactory.create())
// Building the retrofit instance//
                    .build();
        }
        return retrofit;
    }
}

