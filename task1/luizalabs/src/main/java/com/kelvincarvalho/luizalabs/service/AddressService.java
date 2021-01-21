package com.kelvincarvalho.luizalabs.service;

import com.kelvincarvalho.luizalabs.model.AddressDTO;

public interface AddressService {

    AddressDTO getAddress(String zipCode);

}
