public class MainObserver {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        ConsoleDisplay display = new ConsoleDisplay();
        FanController fan = new FanController();

        weatherStation.subscribe(display);
        weatherStation.subscribe(fan);

        weatherStation.setTemperature(26);

        weatherStation.setTemperature(30);

        weatherStation.unsubscribe(display);

        weatherStation.setTemperature(27);
    }
}
