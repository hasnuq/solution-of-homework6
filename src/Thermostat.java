class Thermostat {
    private int temperature = 22;
    private int previousTemperature;

    public void setTemperature(int temperature) {
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
        this.previousTemperature = this.temperature;
        this.temperature = temperature;
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature " + previousTemperature + "°C");
        this.temperature = this.previousTemperature;
    }
}