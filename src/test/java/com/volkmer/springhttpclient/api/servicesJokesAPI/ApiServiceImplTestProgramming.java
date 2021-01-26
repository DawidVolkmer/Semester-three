package com.volkmer.springhttpclient.api.servicesJokesAPI;
import com.volkmer.springhttpclient.api.domain1.Jokes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTestProgramming {
    @Autowired
    ApiServicesJokesProgramming apiServicesJokesProgramming;

    @Test
    public void testGetJokes() throws Exception {



        Jokes[] jokes = apiServicesJokesProgramming.getJokes("programming");

        Assertions.assertEquals(1, jokes.length);

    }
}
