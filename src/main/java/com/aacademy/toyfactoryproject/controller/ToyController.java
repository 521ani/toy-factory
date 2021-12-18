package com.aacademy.toyfactoryproject.controller;

import com.aacademy.toyfactoryproject.converter.ToyConverter;
import com.aacademy.toyfactoryproject.dto.ToyDto;
import com.aacademy.toyfactoryproject.model.Toy;
import com.aacademy.toyfactoryproject.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/toys")
public class ToyController {

    private final ToyService toyService;
    private final ToyConverter toyConverter;

    @Autowired
    public ToyController(ToyService toyService, ToyConverter toyConverter) {
        this.toyService = toyService;
        this.toyConverter = toyConverter;
    }

    @GetMapping
    public ResponseEntity<ToyDto> save(@RequestBody Toy toy) {
        return ResponseEntity.ok(toyConverter.toToyDto(toyService.save(toy)));
    }
}
