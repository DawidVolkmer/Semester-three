package com.volkmer.springhttpclient.api.services;

import com.volkmer.springhttpclient.api.domain.Fact;

public interface ApiServices {
    Fact[] getFacts(Integer amount);
}
