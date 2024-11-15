package adapter;

//Сенсор температуры в Цельсиях.
public class CelsiusSensor implements Sensor{

    private double temperature;

    public CelsiusSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemp() {
        return temperature;
    }
}
