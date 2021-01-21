package com.kelvincarvalho.luizalabs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class AddressDTO implements Serializable {

    private static final long serialVersionUID = -7215784916671002962L;

    private String streetAddress;

    private String city;

    private String state;

    private String country;

    private String zipCode;

}
