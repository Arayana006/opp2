public class MMain {
    public static void main(String[] args) {
        smartHomeMediator mediator = new smartHomeMediator();  // Создаем медиатор

        AirConditioner ac = new AirConditioner();  // Создаем устройства
        SmartLight light = new SmartLight();

        mediator.registerDevice(ac);  // Регистрируем устройства в медиаторе
        mediator.registerDevice(light);

        // Устройства взаимодействуют через медиатор
        mediator.sendMessage("turnOnAC", ac);  // Включаем кондиционер
        mediator.sendMessage("turnOffAC", ac);  // Выключаем кондиционер
    }
}
