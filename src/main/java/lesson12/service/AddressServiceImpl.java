package lesson12.service;

import org.springframework.stereotype.Service;
import lesson12.entity.Address;

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
