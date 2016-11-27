package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class CellPhoneViewTest {
    private CellPhoneView view;
    @Before
    public void SetUp(){

        view=new CellPhoneView();
    }

    @Test
    public void updateViewTest(){
        assertEquals("IMEI: 898767123\nModel: G5\nBrand: LG",view.printCellPhoneDetails("898767123","G5","LG"));
    }

}
