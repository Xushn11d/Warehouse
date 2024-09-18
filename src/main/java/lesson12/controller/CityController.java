package lesson12.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import lesson12.entity.City;
import lesson12.entity.Country;
import lesson12.payload.CityDTO;
import lesson12.repository.CityRepository;
import lesson12.repository.CountryRepository;

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
