package com.example.demo;


import org.json.JSONObject;

public class loginPage
{
    //first check the valid username
    public Boolean checkUserName(String name)
    {
        return checkUserName(name);
    }

    public void signup(JSONObject json)
    {
        // User id will be handled by autoincrement in sql
        String name=json.getString("name");
        String username=json.getString("username");
        int phoneNumber=json.getInt("phoneNumber");
        String branch=json.getString("Branch");
        String year=json.getString("year");

        // Call the procedure to insert the data
    }


    public boolean signin(String encrpytedString)
    {
        // if the string is found in the database, return true
        // else return false
        // Also generate a token for further communication



        return true;
    }
}
