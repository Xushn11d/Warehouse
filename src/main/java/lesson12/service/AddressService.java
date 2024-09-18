package lesson12.service;

import org.springframework.web.bind.annotation.*;
import lesson12.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddresses();
    Address getAddress(Integer id);
    Address addAddress( Address address);
    Address editAddress( Integer id,  Address address);
}
