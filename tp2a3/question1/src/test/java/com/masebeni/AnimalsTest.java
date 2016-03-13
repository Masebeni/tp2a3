package com.masebeni;

import com.masebeni.Impl.Dogs;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class AnimalsTest {
    @Test
    public void testName() throws Exception {
       Animals list = new Dogs();
        Assert.assertSame(list,list);
    }

    @Test
    public void testSet() throws Exception {
        Animals set = new Dogs();
        Assert.assertEquals(set,set);
    }

    @Test
    public void testMap() throws Exception {
      Animals map = new Dogs();
        Assert.assertEquals(map,map);
    }
}
