package com.microservice.store.controller;

import com.microservice.store.dto.PurchaseDto;
import com.microservice.store.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class purchaseController {

    @Autowired
    private PurchaseService service;

    @PostMapping
    public void makePurchase(@RequestBody PurchaseDto purchaseDto) {
        service.makePurchase(purchaseDto);
    }
}
