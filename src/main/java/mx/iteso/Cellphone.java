package mx.iteso;

/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class Cellphone {
    private String IMEI;
    private String model;
    private String brand;

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
