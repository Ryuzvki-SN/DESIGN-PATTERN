package model;

import obs.Observable;
import obs.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * class allowing to obtain a temperature in Celsius or Fahrenheit.
 */
public class Temperature implements Observable {

    protected List<Observer> observers = new LinkedList<>();

    /**
     * champs
     */
    public double celsius;
    public IConvert convert;


    /**
     * constructor takes a Celsius in parameters.
     */
    public Temperature(IConvert fahrenheit) {
        this.convert = fahrenheit; // Dependency Injection
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);//pull
//            observer.update(celsius);//push
        }

    }

    /**
     * get value in celsius
     *
     * @return celsius
     */
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        notifyObservers();
    }

    /**
     * get value in fahrenheit
     *
     * @return fahrenheit
     */
    public double getFahrenheit() {
        return this.convert.celsiusToFahrenheit(celsius);
    }//Delegation


}
