package watcher;

//Класс, который включает/выключает термостат в зависимости от температуры.
public class Thermostat implements Observer{

    private boolean isOn = false;

    @Override
    public void update(double temperature) {
        if (temperature < 10){
            if (isOn) {
                isOn = false;
                System.out.println("Термостат включен: температура слишком низкая");
                return;
            }
        } else if (temperature > 25){
            if (!isOn) {
                isOn = true;
                System.out.println("Термостат выключен: температура слишком высокая.");
                return;
            }
        }
        System.out.println("Термостат " + ((isOn) ? "включен" : "выключен"));
    }
}
