package CuoiKy.TestObserver.WeatherForecast;

public interface IWeatherForecast {
    void attach(Observer observer);
    void detach(Observer observer);
    void updateWeather(double windy, double temp);
}
