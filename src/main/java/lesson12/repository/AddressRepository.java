package lesson12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lesson12.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
