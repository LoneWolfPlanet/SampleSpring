package com.example.VenusSample2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        //Add REST API request here

        String post = "http://localhost:8080/greeting";
        String put = "http://localhost:8080/greeting";

         try{
             String requestGet = "http://localhost:8080/greeting";
             URL obj = new URL(requestGet);
             HttpURLConnection con = (HttpURLConnection) obj.openConnection();
             con.setRequestMethod("GET");
             int responseCode = con.getResponseCode();
             if (responseCode == HttpURLConnection.HTTP_OK) {
                 //Check here
             }
         }catch (Exception e){ }

        //End Request
        model.addAttribute("name", "Welcome to Home page");
        return "welcome";
    }
}
