package com.masebeni.Impl;

import com.masebeni.Animals;

import java.util.*;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class Cows implements Animals {

    public Map cows(){
        Map cows = new HashMap();

        cows.put("001","Jersey");
        cows.put("002","Brown Swiss");

        return cows;
    }
}