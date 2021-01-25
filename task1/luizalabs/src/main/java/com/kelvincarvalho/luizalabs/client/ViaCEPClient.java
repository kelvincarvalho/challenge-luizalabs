package com.kelvincarvalho.luizalabs.client;

import com.kelvincarvalho.luizalabs.model.AddressDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Headers("Content-Type: application/json")
@FeignClient(name = "mock", url = "${zipCode.url:}")
public interface ViaCEPClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{zipCode}/json")
    AddressDTO getZipCode(@PathVariable String zipCode);

}
