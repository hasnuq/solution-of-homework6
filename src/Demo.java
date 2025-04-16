public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command thermostatSet = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();

        remote.setCommand(1, lightOn);
        remote.setCommand(2, thermostatSet);

        remote.pressButton(1);
        remote.pressButton(2);

        remote.undoButton();
    }
}