package com.michaelasawyer.Service;

import com.michaelasawyer.Dao.BeerDao;
import com.michaelasawyer.Entity.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BeerService {

    @Autowired
    private BeerDao beerDao;

    public Collection<Beer> getAllBeers() {
        return beerDao.getAllBeers();
    }
}
