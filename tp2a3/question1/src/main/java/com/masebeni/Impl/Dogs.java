package com.masebeni.Impl;

import com.masebeni.Animals;

import java.util.*;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Dogs implements Animals {

    public List<String> dogsList() {
        List<String> dogs = new ArrayList<String>();

        dogs.add("PitBull");
        dogs.add("Boxer");
        return dogs;
    }
}
