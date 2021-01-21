package com.kelvincarvalho.luizalabs.controller;

import com.kelvincarvalho.luizalabs.model.AddressDTO;
import com.kelvincarvalho.luizalabs.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/address", produces = MediaType.APPLICATION_JSON_VALUE)
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/{zipCode}")
    public AddressDTO getAddress(@PathVariable("zipCode") String zipCode) {
        return addressService.getAddress(zipCode);
    }

}
