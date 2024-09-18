package lesson12.controller;

import lesson12.controller.AddressController;
import org.springframework.web.bind.annotation.RestController;
import lesson12.entity.Address;

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
