package xushnud.service;

import xushnud.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddresses();
    Address getAddress(Integer id);
    Address addAddress( Address address);
    Address editAddress( Integer id,  Address address);
}
