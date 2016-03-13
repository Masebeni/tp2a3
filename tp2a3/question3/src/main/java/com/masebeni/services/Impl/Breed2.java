package com.masebeni.services.Impl;

import com.masebeni.services.Animalss;

import java.util.*;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Breed2 implements Animalss {

    public Set<String> catsList() {

        Set<String> cats = new HashSet();
        cats.add("Lion");
        cats.add("Leopard");
        return cats;
    }

}
