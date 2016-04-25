package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float what = getValue()*95+32;
        Fahrenheit f = new Fahrenheit (what);
        return f;
    }


    public String toString()
        {
            return "" + getValue() + " C";
        }
}
