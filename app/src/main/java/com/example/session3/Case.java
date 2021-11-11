package com.example.session3;

import java.util.Date;

public class Case {
    private String number;
    private String date;
    private String detective;
    private String client;
    private String category;
    private String description;

    public Case(String number, String date, String detective, String client, /*String category, */String description){
        this.number = number;
        this.date = date;
        this.detective = detective;
        this.client = client;
        this.category = category;
        this.description = description;
    }


    public String getNumber(){
        return number;
    }

    public String getDate(){
        return date;
    }

    public String getDetective(){
        return detective;
    }

    public String getClient(){
        return client;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }
}
