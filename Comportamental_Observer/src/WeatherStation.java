import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private double temperature;
    private List<TemperatureObserver> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void subscribe(TemperatureObserver o) {
        observers.add(o);
    }

    public void unsubscribe(TemperatureObserver o) {
        observers.remove(o);
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(temperature);
        }
    }
}
