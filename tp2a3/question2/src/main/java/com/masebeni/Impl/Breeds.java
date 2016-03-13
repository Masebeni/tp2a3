package com.masebeni.Impl;

import com.masebeni.services.Animal;

import java.util.*;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Breeds implements Animal {
    public List<String> dogsList() {
        List<String> dogs = new ArrayList<String>();

        dogs.add("PitBull");
        dogs.add("Boxer");
        return dogs;
    }

    public Set<String> catsList() {

        Set<String> cats = new HashSet();
        cats.add("British");
        cats.add("Persian");
        return cats;
    }

    public Map cows(){
        Map cows = new HashMap();

        cows.put("001","Jersey");
        cows.put("002","Brown Swiss");

        return cows;
    }
}
