package mx.iteso;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class CellphoneTest {

    private Cellphone model;
    @Before
    public void SetUp(){
        model=new Cellphone();
        model.setBrand("Motorola");
        model.setIMEI("1231231231254353");
        model.setModel("G5");
    }

    @Test
    public void getModelTest(){
        assertEquals("G5",model.getModel());
    }
    @Test
    public void getBrandTest(){
        assertEquals("Motorola",model.getBrand());
    }
    @Test
    public void getIMEITest(){
        assertEquals("1231231231254353",model.getIMEI());
    }

}
