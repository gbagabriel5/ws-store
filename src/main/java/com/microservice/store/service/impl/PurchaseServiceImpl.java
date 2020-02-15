package com.microservice.store.service.impl;

import com.microservice.store.dto.InfoProviderDto;
import com.microservice.store.dto.PurchaseDto;
import com.microservice.store.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private RestTemplate client;

    @Override
    public void makePurchase(PurchaseDto dto) {
        ResponseEntity<InfoProviderDto> exchange = client.exchange(
                "http://ws-provider/info/"+dto.getAddress().getState(),
                HttpMethod.GET,
                null,
                InfoProviderDto.class
        );
        System.out.println(exchange.getBody().getAddress());
    }
}
