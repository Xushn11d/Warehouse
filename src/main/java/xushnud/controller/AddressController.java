package xushnud.controller;

import org.springframework.web.bind.annotation.*;
import xushnud.entity.Address;

import java.util.List;

@RequestMapping("/address")
public interface AddressController {
    @GetMapping
    List<Address> getAddresses();

    @GetMapping
    Address getAddress(Integer id);

    @PostMapping
    Address addAddress(@RequestBody Address address);

    @PutMapping("/{id}")
    Address editAddress(@PathVariable Integer id, @RequestBody Address address);
}
