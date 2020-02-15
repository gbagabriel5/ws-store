package com.microservice.store.service;

import com.microservice.store.dto.PurchaseDto;

public interface PurchaseService {
    void makePurchase(PurchaseDto dto);
}
