package xushnud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xushnud.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
