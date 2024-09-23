package xushnud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xushnud.entity.City;
import xushnud.entity.Country;
import xushnud.payload.CityDTO;
import xushnud.repository.CityRepository;
import xushnud.repository.CountryRepository;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    public String addCity(CityDTO cityDTO) {
        Country country = countryRepository
                .findById(cityDTO.getCountryId())
                .orElseThrow(()->new RuntimeException("Country not found"));

        City city = new City();
        city.setName(cityDTO.getName());
        city.setCountry(country);
        cityRepository.save(city);
        return "saved";
    }

}
