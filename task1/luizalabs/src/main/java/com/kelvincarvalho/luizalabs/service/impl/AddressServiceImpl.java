package com.kelvincarvalho.luizalabs.service.impl;

import com.kelvincarvalho.luizalabs.client.ViaCEPClient;
import com.kelvincarvalho.luizalabs.exception.ApiException;
import com.kelvincarvalho.luizalabs.model.AddressDTO;
import com.kelvincarvalho.luizalabs.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class AddressServiceImpl implements AddressService  {

    @Autowired
    private ViaCEPClient viaCEPClient;

    private int index;

    private AddressDTO address;

    @Override
    public AddressDTO getAddress(String zipCode) {
        var zipCodeValid = this.validateZipCode(zipCode);
        this.index = zipCode.length() - 1;
        this.getAddressByZipCode(zipCodeValid);
        
        return this.address;
    }

    private AddressDTO getAddressByZipCode(String zipCode) {
        address = viaCEPClient.getZipCode(zipCode);

        if(isNull(address.getZipCode()))
            this.validateReturn( zipCode);

        this.address = address;
        return address;
    }

    private void validateReturn(String zipCode) {

        if(this.index >= 0) {
            var zc = zipCode.substring(0, this.index)  + "0" + zipCode.substring(this.index + 1);
            this.index = this.index - 1;
            this.getAddressByZipCode(zc);
        } else {
            throw new ApiException("Invalid zip code");
        }

    }

    private String validateZipCode(String zipCode) {
        zipCode = zipCode.replaceAll("-", "");
        if(zipCode.length() != 8 )
            throw new ApiException("Invalid zip code");

        return zipCode;
    }


}
