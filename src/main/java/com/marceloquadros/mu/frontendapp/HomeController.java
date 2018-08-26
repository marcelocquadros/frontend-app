package com.marceloquadros.mu.frontendapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${backendurl}")
    private String backendUrl;



    @GetMapping
    public String index(){
        return "It Works!";
    }

    @GetMapping("/backend")
    public String backend(){
        System.out.println("Url from properties: >>>>> " + backendUrl);
        return restTemplate.getForEntity(backendUrl + "/persons" ,String.class).getBody();

    }

}
