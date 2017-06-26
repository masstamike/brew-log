package com.michaelasawyer.Dao;

import com.michaelasawyer.Entity.Beer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("mockData")
public class MockBeerDaoImpl implements BeerDao {

    private static Map<Integer, Beer> beers;

    static {
        beers = new HashMap<Integer, Beer>() {
            {
                put(1, new Beer(1, "Pale Ale", "Ale"));
                put(2, new Beer(2, "Pliney the Elder", "IPA"));
                put(3, new Beer(3, "Old Rasputin", "Imperial Stout"));
            }
        };
    }

    @Override
    public Collection<Beer> getAllBeers() {
        return beers.values();
    }

    @Override
    public Beer getBeerById(int id) {
        return beers.get(id);
    }

    @Override
    public void removeBeerById(int id) {
        beers.remove(id);
    }

    @Override
    public void updateBeer(Beer beer) {
        Beer b = beers.get(beer.getId());
        b.setName(beer.getName());
        b.setType(beer.getType());
        beers.put(b.getId(), b);
    }

    @Override
    public void insertBeer(Beer beer) {
        beers.put(beer.getId(), beer);
    }
}
