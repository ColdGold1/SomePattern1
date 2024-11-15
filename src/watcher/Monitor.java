package watcher;

import adapter.Sensor;

import java.util.ArrayList;
import java.util.List;

//Класс, содержащий наблюдаемую температуру.
public class Monitor {

    private List<Observer> observers;

    private double currentTemperature;

    public Monitor() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void addObserver(List<Observer> newObservers){
        observers.addAll(newObservers);
    }

    public void checkTemperature(Sensor sensor){
        double newTemperature = sensor.getTemp();
        if (newTemperature != currentTemperature){
            currentTemperature = newTemperature;
            sendNotification();
        }
    }

    public void sendNotification(){
        for (Observer observer : observers){
            observer.update(currentTemperature);
        }
    }

}
