import java.util.ArrayList;
import java.util.List;

public class smartHomeMediator implements Mediator {
    private List<Device> devices = new ArrayList<>();  // Список всех устройств

    @Override
    public void registerDevice(Device device) {
        devices.add(device);  // Регистрируем устройство
    }

    @Override
    public void sendMessage(String message, Device device) {
        if (message.equals("turnOnAC")) {
            System.out.println("Включение кондиционера...");
            for (Device d : devices) {
                if (d instanceof AirConditioner) {
                    d.turnOn();
                }
            }
        } else if (message.equals("turnOffAC")) {
            System.out.println("Выключение кондиционера...");
            for (Device d : devices) {
                if (d instanceof AirConditioner) {
                    d.turnOff();
                }
            }
        }
    }
}
