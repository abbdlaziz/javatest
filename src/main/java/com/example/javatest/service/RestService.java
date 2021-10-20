package com.example.javatest.service;

import com.example.javatest.model.Position;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class RestService {
    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Position[] getAllPosition() {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
        return this.restTemplate.getForObject(url, Position[].class);
    }
    public Position getPositionById(UUID id) {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions/" + id.toString();
        return this.restTemplate.getForObject(url, Position.class);
    }
}
