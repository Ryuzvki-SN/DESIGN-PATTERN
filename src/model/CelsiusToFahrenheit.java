package model;

/**
 * classe qui implemente l'interface Iconvert
 */
public class CelsiusToFahrenheit implements IConvert {
    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
