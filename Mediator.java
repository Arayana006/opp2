public interface Mediator {
    void registerDevice(Device device);  // Регистрация устройства
    void sendMessage(String message, Device device);  // Отправка сообщений между устройствами
}

