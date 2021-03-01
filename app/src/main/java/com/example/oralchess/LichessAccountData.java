package com.example.oralchess;

import com.google.gson.annotations.SerializedName;

/*
    POJO for storing server response
    for requests to /api/account
    (just storing id for the time being)
 */
public class LichessAccountData {

    @SerializedName("id")
    private String id;

    public LichessAccountData(String email) {
        this.id = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
