package com.michaelasawyer.Dao;

import com.michaelasawyer.Entity.Beer;

import java.util.Collection;

/**
 * Created by masstamike on 6/25/17.
 */
public interface BeerDao {
    Collection<Beer> getAllBeers();

    Beer getBeerById(int id);

    void removeBeerById(int id);

    void updateBeer(Beer beer);

    void insertBeer(Beer beer);
}
