package xushnud.controller;

import org.springframework.web.bind.annotation.RestController;
import xushnud.entity.Address;

import java.util.List;

@RestController
public class AddressControllerImpl implements AddressController {
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
