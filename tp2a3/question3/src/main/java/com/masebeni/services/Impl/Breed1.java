package com.masebeni.services.Impl;

import com.masebeni.services.Animalss;

import java.util.*;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Breed1 implements Animalss {
    public List<String> dogsList() {
        List<String> dogs = new ArrayList<String>();

        dogs.add("Shepard");
        dogs.add("BullDog");

        return dogs;
    }

}
