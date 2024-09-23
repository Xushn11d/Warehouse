package xushnud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xushnud.entity.City;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {
    List<City> findAllByCountry_Name(String name);


}
