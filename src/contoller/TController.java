package contoller;

import model.Temperature;
import obs.Observable;
import obs.Observer;
import view.TView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TController implements Observer, ActionListener {
    public  Temperature temperature;
    public TView view;

    public TController(Temperature temperature, TView view) {
        this.temperature = temperature;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField inputCelsius  = view.getInputCelsius();
        temperature.setCelsius(Double.parseDouble(inputCelsius.getText()));
    }

    @Override
    public void update(Observable observable) {
        Temperature temperature = (Temperature) observable;
        JTextField outputFahrenheit = view.getOutputFahrenheit();
        outputFahrenheit.setText(String.valueOf(temperature.getFahrenheit()));

    }

}
