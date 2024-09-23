package xushnud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import xushnud.entity.Country;
import xushnud.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;


    public List<Country> getAllBySmth(int size,int page) {
        long count = countryRepository.count();
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return countryRepository.findAllByIdGreaterThan(0,pageable);
    }

    public void add(Country country) {
        if (countryRepository.existsByName(country.getName())){
            System.out.println("please enter another name");
            return;
        }
        countryRepository.save(country);
    }
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
    public Country getCountry(Integer id) {
        Optional<Country> optionalCountry = countryRepository.findById(id);
        return optionalCountry.orElse(null);
    }

    public void edit(Integer id, Country country) {
        Optional<Country> optionalCountry = countryRepository.findById(id);
        if (optionalCountry.isPresent()) {
            Country temp = optionalCountry.get();
            temp.setName(country.getName());
            countryRepository.save(temp);
        }else {
            System.out.println("hech vaqo topilmadi");
        }
    }
    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }

    public List<Country> findAll(String name) {
//        countryRepository.getCountryByNameContains(name);
        return countryRepository.findAllByNameContains(name);
    }
}
