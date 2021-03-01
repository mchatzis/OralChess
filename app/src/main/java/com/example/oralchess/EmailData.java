package com.example.oralchess;

import com.google.gson.annotations.SerializedName;

public class EmailData {

    @SerializedName("email")
    private String email;

    public EmailData(String email) { this.email = email; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
