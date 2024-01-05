package CuoiKy.TestObserver.WeatherForecast;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast implements IWeatherForecast {
    List<Observer> observers = new ArrayList<>();
    double windy, temp;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateWeather(double windy, double temp) {
        this.windy = windy;
        this.temp = temp;

    }
    void notifyChange(double windy, double temp) {
        for (Observer o : observers) {
            o.update(windy, temp);
        }
    }
}
