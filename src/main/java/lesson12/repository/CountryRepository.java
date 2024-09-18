package lesson12.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import lesson12.entity.Country;

import java.util.List;
import java.util.Optional;


public interface CountryRepository extends JpaRepository<Country, Integer> {


    boolean existsAllByNameNot(String name);
    List<Country> findAllByIdGreaterThan(int id, Pageable pageable);
    boolean existsByName(String name);
    List<Country> findAllByNameContains(String name);
}
