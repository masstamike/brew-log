package com.michaelasawyer.Controllers;

import com.michaelasawyer.Entity.Beer;
import com.michaelasawyer.Service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
