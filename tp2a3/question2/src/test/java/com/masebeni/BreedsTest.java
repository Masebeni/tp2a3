package com.masebeni;

import com.masebeni.Impl.Breeds;
import com.masebeni.services.Animal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class BreedsTest {
    @Test
    public void testName() throws Exception {
        Animal list = new Breeds();
        Assert.assertSame(list,list);
    }

    @Test
    public void testSet() throws Exception {
        Animal set = new Breeds();
        Assert.assertEquals(set,set);
    }

    @Test
    public void testMap() throws Exception {
        Animal map = new Breeds();
        Assert.assertEquals(map,map);
    }
}
