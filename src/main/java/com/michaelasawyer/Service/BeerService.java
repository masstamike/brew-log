package com.michaelasawyer.Service;

import com.michaelasawyer.Dao.BeerDao;
import com.michaelasawyer.Entity.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BeerService {

    @Autowired
    @Qualifier("mockData")
    private BeerDao beerDao;

    public Collection<Beer> getAllBeers() {
        return beerDao.getAllBeers();
    }

    public Beer getBeerById(int id) {
        return this.beerDao.getBeerById(id);
    }

    public void removeBeerById (int id) {
        this.beerDao.removeBeerById(id);
    }

    public void updateBeer (Beer beer) {
        this.beerDao.updateBeer(beer);
    }

    public void insertBeer (Beer beer) {
        this.beerDao.insertBeer(beer);
    }
}
