package xushnud.service;

import org.springframework.stereotype.Service;
import xushnud.entity.Address;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService
{
    @Override
    public List<Address> getAddresses() {
        return List.of();
    }

    @Override
    public Address getAddress(Integer id) {
        return null;
    }

    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public Address editAddress(Integer id, Address address) {
        return null;
    }
}
