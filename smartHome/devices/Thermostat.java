package smartHome.devices;

public class Thermostat {
    private int temperature = 20;

    public void setTemperature(int temp) {
        System.out.println("[Термостат] Установка температуры на " + temp + "°C");
        temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }
}
