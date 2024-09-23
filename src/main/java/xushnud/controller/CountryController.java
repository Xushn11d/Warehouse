package xushnud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import xushnud.entity.Country;
import xushnud.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @PostMapping
    public String addCountry(@RequestBody Country country){
        countryService.add(country);
        return "saved";
    }

    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.findAll();
    }
    @GetMapping("/{id}")
    public Country getCountry(@PathVariable Integer id){
         countryService.delete(id);
         return null;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        countryService.delete(id);
        return "deleted";
    }

    @PutMapping("/{id}")
    public String edit(@PathVariable Integer id, @RequestBody Country country){
        countryService.edit(id,country);
        return "edited";
    }

    @GetMapping("/search")
    public List<Country> findAll(@RequestParam String name) {
        return countryService.findAll(name);
    }
    @GetMapping("/withId")
    public List<Country> withId(@RequestParam Integer size, @RequestParam(value = "page", defaultValue = "1") Integer page) {
        page = page-1;
        System.out.println(size);
        System.out.println(page);
        return countryService.getAllBySmth(size,page);
    }

}
