package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature t = new Celsius(this.getValue());
        return t;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature t = new Fahrenheit(9*this.getValue()/5 + 32);
        return t;
    }

    public String toString()
    {
        return this.getValue() + " C";
    }
}
