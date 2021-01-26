package com.volkmer.springhttpclient.api.servicesBoredAPI;

import com.volkmer.springhttpclient.api.domain2.Bored;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImplBoredPrice implements ApiServicesBoredPrice {

    private RestTemplate restTemplate;

    public ApiServiceImplBoredPrice(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Bored getBored(Double price) {

        Bored bored = restTemplate.getForObject("http://www.boredapi.com/api/activity?price="+price, Bored.class);
        return bored;
    }

}

