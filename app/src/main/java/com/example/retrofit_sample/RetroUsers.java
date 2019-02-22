package com.example.retrofit_sample;

import com.google.gson.annotations.SerializedName;

public class RetroUsers {
    @SerializedName("name")
    private String name;

    public RetroUsers(String name) {
        this.name = name;
    }
        public String getUser() {
            return name;
        }
            public void SetUser(){
            this.name = name;
            }

    }

