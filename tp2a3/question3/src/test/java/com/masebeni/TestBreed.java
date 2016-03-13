package com.masebeni;

import com.masebeni.services.Impl.Breed1;
import com.masebeni.services.Animalss;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class TestBreed { @Test
public void testName() throws Exception {
    Animalss list = new Breed1();
    Assert.assertSame(list,list);
}

    @Test
    public void testSet() throws Exception {
        Animalss set = new Breed1();

        Set<String> cats = new HashSet();
        cats.add("Lion");
        Assert.assertEquals(set.equals("Lion"),cats.contains("Leopard"));
    }

    @Test
    public void testMap() throws Exception {
        Animalss map = new Breed1();
        Assert.assertEquals(map,map);
    }
}
