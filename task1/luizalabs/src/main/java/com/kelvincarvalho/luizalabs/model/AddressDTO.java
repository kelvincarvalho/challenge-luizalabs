package com.kelvincarvalho.luizalabs.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;

@Builder
@AllArgsConstructor
public class AddressDTO implements Serializable {

    private static final long serialVersionUID = -8863384049589074718L;

    private String streetAddress;

    private String neighborhood;

    private String city;

    private String state;

    private String zipCode;

    @JsonGetter(value = "streetAddress")
    public String getStreetAddress() { return streetAddress; }

    @JsonSetter(value = "logradouro")
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    @JsonGetter(value = "neighborhood")
    public String getNeighborhood() { return neighborhood; }

    @JsonSetter(value = "bairro")
    public void setNeighborhood(String neighborhood) { this.neighborhood = neighborhood; }

    @JsonGetter(value = "city")
    public String getCity() { return city; }

    @JsonSetter(value = "localidade")
    public void setCity(String city) { this.city = city; }

    @JsonGetter(value = "state")
    public String getState() { return state; }

    @JsonSetter(value = "uf")
    public void setState(String state) { this.state = state; }

    @JsonGetter(value = "zipCode")
    public String getZipCode() { return zipCode; }

    @JsonSetter(value = "cep")
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }


}
