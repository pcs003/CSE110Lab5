package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature t = new Celsius((this.getValue()-32)*5/9);
        return t;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature t = new Fahrenheit(this.getValue());
        return t;
    }

    public String toString()
    {
        return this.getValue() + " F";
    }
}
