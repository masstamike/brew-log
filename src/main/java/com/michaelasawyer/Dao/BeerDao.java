package com.michaelasawyer.Dao;

import com.michaelasawyer.Entity.Beer;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BeerDao {

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

    public Collection<Beer> getAllBeers() {
        return this.beers.values();
    }
}
