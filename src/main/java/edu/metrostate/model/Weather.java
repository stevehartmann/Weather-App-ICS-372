package edu.metrostate.model;

public class Weather {

    public static final Weather CITY_NOT_FOUND = new Weather();

    private int temperature;
    private double temperatureMin;
    private double temperatureMax;
    private double humidity;
    private double windSpeed;
    private String windDirection;
    private int clouds;
    private int sunrise;
    private int sunset;
    private double visibility;
    private String description;
    private String icon; // Add icon property
    private double dewPoint; // Add dewPoint property
    private double pressure; // Add pressure property
    private int uv; // Add uv property
    private String locationName;

    public int getTemperature() {
        return temperature;
    }

    public Weather setTemperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public double convertTemperature(double temperature, TemperatureUnit unit) {
        switch (unit) {
            case CELSIUS:
                return (temperature - 32) * 5.0 / 9.0;
            case KELVIN:
                return (temperature - 32) * 5.0 / 9.0 + 273.15;
            case FAHRENHEIT:
            default:
                return temperature;
        }
    }

    public double convertWindSpeed(double windSpeed, WindSpeedUnit unit) {
        switch (unit) {
            case KPH:
                return windSpeed * 1.60934; // Convert mph to kph
            case MS:
                return windSpeed * 0.44704; // Convert mph to m/s
            case KNOTS:
                return windSpeed * 0.868976; // Convert mph to knots
            case MPH:
            default:
                return windSpeed; // No conversion needed if it's already in mph
        }
    }

    public double convertDistance(double distance, DistanceUnit unit) {
        final double MILES_TO_KM = 1.60934; // Conversion factor from miles to kilometers
        final double KM_TO_MILES = 1 / MILES_TO_KM; // Conversion factor from kilometers to miles

        switch (unit) {
            case KILOMETERS:
                return distance * MILES_TO_KM; // Convert miles to kilometers
            case MILES:
                return distance * KM_TO_MILES; // Convert kilometers to miles
            default:
                return distance; // No conversion if the unit is not recognized
        }
    }


    public Weather setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
        return this;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public Weather setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
        return this;
    }

    public double getHumidity() {
        return humidity;
    }

    public Weather setHumidity(double humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public Weather setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public Weather setWindDirection(String windDirection) {
        this.windDirection = windDirection;
        return this;
    }

    public int getClouds() {
        return clouds;
    }

    public Weather setClouds(int clouds) {
        this.clouds = clouds;
        return this;
    }

    public int getSunrise() {
        return sunrise;
    }

    public Weather setSunrise(int sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public int getSunset() {
        return sunset;
    }

    public Weather setSunset(int sunset) {
        this.sunset = sunset;
        return this;
    }

    public double getVisibility() {
        return visibility;
    }

    public Weather setVisibility(double visibility) {
        this.visibility = visibility;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Weather setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public Weather setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public Weather setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    public double getPressure() {
        return pressure;
    }

    public Weather setPressure(double pressure) {
        this.pressure = pressure;
        return this;
    }

    public int getUv() {
        return uv;
    }

    public Weather setUv(int uv) {
        this.uv = uv;
        return this;
    }

    public String getLocationName() {
        return locationName;
    }

    public Weather setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
}
