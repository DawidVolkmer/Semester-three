package com.volkmer.springhttpclient.api.servicesJokesAPI;

import com.volkmer.springhttpclient.api.domain1.Jokes;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImplJokesRandomTen implements ApiServicesJokesRandomTen {

    private RestTemplate restTemplate;

    public ApiServiceImplJokesRandomTen(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Jokes[] getJokes() {

        Jokes[] jokes = restTemplate.getForObject("https://official-joke-api.appspot.com/random_ten", Jokes[].class);
        return jokes;
    }

}