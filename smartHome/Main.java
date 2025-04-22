package smartHome;

import smartHome.devices.*;
import smartHome.command.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 21);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOn);
        remote.setCommand("temp", setTemp);

        remote.pressButton("light");
        remote.pressButton("temp");
        remote.undoButton();
    }
}
