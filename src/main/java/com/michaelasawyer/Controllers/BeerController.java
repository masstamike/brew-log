package com.michaelasawyer.Controllers;

import com.michaelasawyer.Entity.Beer;
import com.michaelasawyer.Service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Beer> getAllBeers() {
        return beerService.getAllBeers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("id") int id) {
        return beerService.getBeerById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBeer(@PathVariable("id") int id) {
        beerService.removeBeerById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBeer(@RequestBody Beer beer) {
        beerService.updateBeer(beer);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertBeer(@RequestBody Beer beer) {
        beerService.insertBeer(beer);
    }
}
