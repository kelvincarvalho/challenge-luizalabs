package com.kelvincarvalho.luizalabs.service;

import com.kelvincarvalho.luizalabs.model.AddressDTO;
import com.kelvincarvalho.luizalabs.service.impl.AddressServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class AddressServiceImplTest {

    @InjectMocks
    private AddressServiceImpl addressService;

    private final AddressDTO addressMock = AddressDTO.builder()
            .streetAddress("Monte Verde")
            .zipCode("18703740")
            .state("São Paulo")
            .city("Avaré")
            .country("Brazil")
            .build();

    @Test
    public void shouldThrowExceptionWhenPostalCodeIsInvalid() {
        // TODO
        var zipCodeInvalid = "00000000";
        assertThrows(ClassNotFoundException.class, () -> addressService.getAddress(zipCodeInvalid));
    }

    @Test
    public void shouldAddZeroInThePostalCodeWhenNotFoundAddress() {
        // TODO
        var zipCode = "18701690";
        var address = addressService.getAddress(zipCode);

        assertNotEquals(address.getZipCode(), zipCode);
    }

    @Test
    public void shouldReturnAddressWhenPostalCodeIsValid() {
        var zipCodeValid = "18703740";
        var address = addressService.getAddress(zipCodeValid);

        assertEquals(address, addressMock);
    }


}
