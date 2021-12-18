package com.aacademy.toyfactoryproject.controller;

import com.aacademy.toyfactoryproject.converter.StoreConverter;
import com.aacademy.toyfactoryproject.dto.StoreDto;
import com.aacademy.toyfactoryproject.model.Store;
import com.aacademy.toyfactoryproject.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

    private final StoreService storeService;
    private final StoreConverter storeConverter;

    @Autowired
    public StoreController(StoreService storeService, StoreConverter storeConverter) {
        this.storeService = storeService;
        this.storeConverter = storeConverter;
    }

    @GetMapping
    public ResponseEntity<StoreDto> save(@RequestBody Store store) {
        return ResponseEntity.ok(storeConverter.toStoreDto(storeService.save(store)));
    }
}
