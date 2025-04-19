package smartHome.command;

import smartHome.devices.Thermostat;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int prevTemp;
    private int newTemp;

    public SetThermostatCommand(Thermostat thermostat, int newTemp) {
        this.thermostat = thermostat;
        this.newTemp = newTemp;
    }

    public void execute() {
        prevTemp = thermostat.getTemperature();
        thermostat.setTemperature(newTemp);
    }

    public void undo() {
        thermostat.setTemperature(prevTemp);
    }
}