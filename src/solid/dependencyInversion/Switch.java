package solid.dependencyInversion;

public class Switch {

    public static void operate (boolean button, Switchable device) {
        if (button) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
