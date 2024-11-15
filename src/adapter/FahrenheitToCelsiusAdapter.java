package adapter;

import java.util.Optional;


//Адаптер, конвертирующий температуру из фаренгейтов в цельсии.
public class FahrenheitToCelsiusAdapter implements Sensor{

    private FahrenheitSensor fahrenheitSensor;
    private Optional<Double> temperature = Optional.empty();

    public FahrenheitToCelsiusAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    public void setFahrenheitSensor(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemp() {

        double fahrenheitTemperature = fahrenheitSensor.getTemperature();
        double celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;

        if (temperature.isEmpty() || temperature.get() != celsiusTemperature){
            System.out.println("Значение температуры в адаптере было изменено");
            temperature = Optional.of(celsiusTemperature);
        }

        return celsiusTemperature;
    }
}
