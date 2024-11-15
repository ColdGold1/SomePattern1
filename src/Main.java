import adapter.CelsiusSensor;
import adapter.FahrenheitSensor;
import adapter.FahrenheitToCelsiusAdapter;
import watcher.Monitor;
import watcher.TemperatureApp;
import watcher.Thermostat;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создание 3-ёх сенсоров, 1 для цельсия, 1 для фаренгейта и адаптер.
        CelsiusSensor celsiusSensor = new CelsiusSensor(25.5);
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(85.4);
        FahrenheitToCelsiusAdapter adapter = new FahrenheitToCelsiusAdapter(fahrenheitSensor);
        System.out.printf("%.2f в фаренгейтах = %.2f в цельсиях %n",fahrenheitSensor.getTemperature(),
                adapter.getTemp());

        //Создаём 2 наблюдателя.
        Thermostat thermostat = new Thermostat();
        TemperatureApp temperatureApp = new TemperatureApp();


        Monitor monitor = new Monitor();
        //Мониторинг температуры.
        monitor.addObserver(List.of(temperatureApp, thermostat));
        monitor.checkTemperature(celsiusSensor);
        monitor.checkTemperature(adapter);

    }
}