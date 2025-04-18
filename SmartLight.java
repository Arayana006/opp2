public class SmartLight implements Device {
    @Override
    public void turnOn() {
        System.out.println("Умная лампочка включена.");
    }

    @Override
    public void turnOff() {
        System.out.println("Умная лампочка выключена.");
    }
}
