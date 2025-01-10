// Base Class: WeatherStation
public class WeatherStation {
    protected String location;
    protected String stationId;

    public WeatherStation(String location, String stationId) {
        this.location = location;
        this.stationId = stationId;
    }

    public void displayData() {
        System.out.println("Weather Station ID: " + stationId);
        System.out.println("Location: " + location);
    }
}

// Derived Class: TemperatureStation
public class TemperatureStation extends WeatherStation {
    private double temperature;

    public TemperatureStation(String location, String stationId, double temperature) {
        super(location, stationId);
        this.temperature = temperature;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Temperature: " + temperature + "C");
    }
}

// Derived Class: RainfallStation
public class RainfallStation extends WeatherStation {
    private double rainfall;

    public RainfallStation(String location, String stationId, double rainfall) {
        super(location, stationId);
        this.rainfall = rainfall;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Rainfall: " + rainfall + " mm");
    }
}

// Main Method
public class three {
    public static void main(String[] args) {
        WeatherStation[] weatherStations = new WeatherStation[3];

        weatherStations[0] = new TemperatureStation("New York", "TS001", 25.0);
        weatherStations[1] = new RainfallStation("London", "RS002", 10.5);
        weatherStations[2] = new TemperatureStation("Tokyo", "TS003", 30.0);

        for (WeatherStation station : weatherStations) {
            station.displayData();
            System.out.println();
        }
    }
}