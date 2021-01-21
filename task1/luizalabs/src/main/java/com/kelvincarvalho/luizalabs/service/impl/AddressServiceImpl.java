package com.kelvincarvalho.luizalabs.service.impl;

import com.kelvincarvalho.luizalabs.model.AddressDTO;
import com.kelvincarvalho.luizalabs.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService  {

    @Override
    public AddressDTO getAddress(String zipCode) {
        var zipCodeValid = this.validateZipCode(zipCode);

        return null;
    }

    private String validateZipCode(String zipCode) {
        zipCode = zipCode.replace("-", "");

        if(zipCode.length() != 8 ) {
            // TODO: add error
        }

        return zipCode;
    }

}
