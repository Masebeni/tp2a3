package com.masebeni.services.Impl;

import com.masebeni.services.Animalss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Breed3 implements Animalss {

    public Map cows(){
        Map cows = new HashMap();

        cows.put("001","Brown Swiss");
        cows.put("002","Jersey");

        return cows;
    }
}