package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.json.*;

@RestController
public class Controller
{
    @RequestMapping(method=RequestMethod.POST,value="/checkUserName")
    public Boolean checkUserName(@RequestBody String name)
    {
        return checkUserName(name);
    }

    @RequestMapping(method=RequestMethod.POST,value="/signup")
    public void signup(@RequestBody JSONObject json)
    {
        signup(json);
    }

    @RequestMapping(method=RequestMethod.POST,value="/signin")
    public boolean signin(@RequestBody String encryptedString)
    {
        return signin(encryptedString);
    }
}
