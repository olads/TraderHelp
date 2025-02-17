package com.migia.rest;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;
import org.springframework.http.HttpStatusCode;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class GetDataFromAnotherService {

    private RestClient restClient;

    @Autowired
    public GetDataFromAnotherService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://curly-halibut-r64xg95g95v2xx57-3031.app.github.dev").build();
    }

    public List<CandleStick> getCandlesticks() {
        try {
            return restClient.get()
                .uri("/data")
                .retrieve()
                .body(List.class);
        } catch (RestClientException e) {
            // Handle errors
            throw new RuntimeException("Failed to fetch data", e);
        }
    }
    
}