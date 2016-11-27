package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class CellPhoneControllerTest {
    private Cellphone model;
    private CellPhoneController controller;
    private CellPhoneView view;
    @Before
    public void SetUp(){
        model=new Cellphone();
        model.setBrand("Motorola");
        model.setIMEI("1231231231254353");
        model.setModel("G5");
        view=new CellPhoneView();
        controller=new CellPhoneController(model,view);

    }

    @Test
    public void getIMEITest(){
        assertEquals("1231231231254353",controller.getIMEI());
    }
    @Test
    public void getBrandTest(){
        assertEquals("Motorola",controller.getBrand());
    }
    @Test
    public void getModelTest(){
        assertEquals("G5",controller.getModel());
    }

    @Test
    public void setIMEITest(){
        controller.setIMEI("545412317566213");
        assertEquals("545412317566213",controller.getIMEI());
    }
    @Test
    public void setBrandTest(){
        controller.setBrand("HUAWEI");
        assertEquals("HUAWEI",controller.getBrand());
    }
    @Test
    public void setModelTest(){
        controller.setModel("L5");
        assertEquals("L5",controller.getModel());
    }


    @Test
    public void updateViewTest(){
        assertEquals("IMEI: 1231231231254353\nModel: G5\nBrand: Motorola",controller.updateView());
    }

}
