package com.volkmer.springhttpclient.api.servicesJokesAPI;

import com.volkmer.springhttpclient.api.domain1.Jokes;

public interface ApiServicesJokesProgramming {
    Jokes[] getJokes(String type);
}
