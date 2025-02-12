package com.example.freteflex.controller;

import com.example.freteflex.controller.dto.ShippingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping(value = "/shipping/calculate")
    public ResponseEntity<ShippingResponse> calcular(@RequestParam("shippingType") String shippingType,
                                                     @RequestParam("distance") Double distance,
                                                     @RequestParam("weight") Double weight) {

        return ResponseEntity.ok(new ShippingResponse(0.0));
    }

}
