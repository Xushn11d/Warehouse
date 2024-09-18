package lesson12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lesson12.entity.City;
import lesson12.entity.Country;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {
    List<City> findAllByCountry_Name(String name);


}
