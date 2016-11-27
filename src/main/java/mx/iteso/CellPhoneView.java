package mx.iteso;

/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class CellPhoneView {

    public String printCellPhoneDetails(String IMEI,String Model, String brand){
        String viewContent="IMEI: "+IMEI+"\n"+"Model: "+Model+"\nBrand: "+brand;
        System.out.println(viewContent);
        return viewContent;
    }
}

