package watcher;

//Класс, уведомляющий пользователя о текущей погоде.
public class TemperatureApp implements Observer{

    @Override
    public void update(double temperature) {
        System.out.printf("Текущая погода в цельсиях: %.2f%n",temperature);
    }
}
