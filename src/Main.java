import contoller.TController;
import model.CelsiusToFahrenheit;
import model.IConvert;
import model.Temperature;

import view.TView;

public class Main {
    public static void main(String[] args) {

        //view
        TView view = new TView();
        view.init();

        //Model
        IConvert fahrenheint = new CelsiusToFahrenheit();
        Temperature temperature = new Temperature(fahrenheint);

        //Controller
        TController controller = new TController(temperature, view);

        //Observer
        temperature.addObserver(view);
        temperature.addObserver(controller);

        //Action
        view.getButton().addActionListener(controller);


    }
}
