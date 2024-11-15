package adapter;

//Сенсор температуры в Фаренгейтах.
public class FahrenheitSensor {

    private double temperature;

    public FahrenheitSensor(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
