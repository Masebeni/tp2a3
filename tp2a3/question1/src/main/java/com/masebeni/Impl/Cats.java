package com.masebeni.Impl;

import com.masebeni.Animals;

import java.util.*;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Cats implements Animals {

    public Set<String> catsList() {

        Set<String> cats = new HashSet();
        cats.add("British");
        cats.add("Persian");
        return cats;
    }
}

