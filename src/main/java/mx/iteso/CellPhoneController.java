package mx.iteso;

/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class CellPhoneController {
    private Cellphone model;
    private CellPhoneView view;

    public CellPhoneController(Cellphone model, CellPhoneView view){
        this.model = model;
        this.view = view;
    }

    public void setIMEI(String IMEI){
        model.setIMEI(IMEI);
    }

    public String getIMEI(){
        return model.getIMEI();
    }

    public void setModel(String modelN){
        model.setModel(modelN);
    }

    public String getModel(){
        return model.getModel();
    }

    public void setBrand(String brand){
        model.setBrand(brand);
    }

    public String getBrand(){
        return model.getBrand();
    }

    public String updateView(){
        return view.printCellPhoneDetails(model.getIMEI(), model.getModel(),model.getBrand());
    }
}
