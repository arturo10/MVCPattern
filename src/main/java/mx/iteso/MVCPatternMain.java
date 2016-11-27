package mx.iteso;

/**
 * Created by Arturo Hernandez on 26/11/2016.
 */
public class MVCPatternMain {

    public static void main(String[] args){

        Cellphone model  = new Cellphone();
        model.setBrand("Nokia");
        model.setModel("N5");
        model.setIMEI("89128391829123123");
        CellPhoneView view = new CellPhoneView();
        CellPhoneController controller = new CellPhoneController(model, view);
        controller.updateView();
        controller.setBrand("Samsung");
        controller.updateView();
    }
}
