package deqo.aper.mysimplestack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {



    @Test
    public void getValue(){
        Object v = new Object();
        Object v2 = new Object();
        Item it = new Item(v);
        Assert.assertEquals(v , it.getValue());
        Assert.assertNotEquals(v2 , it.getValue());
    }

    @Test
    public void setValue() {
        Object v = new Object();
        Object v2 = new Object();
        Item it = new Item(v);
        Item it2 = new Item(v2) ;
        Assert.assertNotEquals(it2.getValue(),it.getValue());
        it2.setValue(v);
        Assert.assertEquals(it2.getValue(),it.getValue());


    }
}