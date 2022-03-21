import controller.TController;
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
        IConvert fahrenheit = new CelsiusToFahrenheit();
        Temperature temperature = new Temperature(fahrenheit);

        //Controller
        TController controller = new TController(temperature, view);

        //Observer
        temperature.addObserver(view);
        temperature.addObserver(controller);

        //Action
        view.getButton().addActionListener(controller);


    }
}
