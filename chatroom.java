import java.util.ArrayList;
import java.util.List;

public class chatroom implements subject {
    private List<Observer> participants = new ArrayList<>();  // Список участников чата
    private String message;  // Сообщение, которое будет отправлено

    @Override
    public void addObserver(Observer observer) {
        participants.add(observer);  // Добавляем нового участника чата
    }

    @Override
    public void removeObserver(Observer observer) {
        participants.remove(observer);  // Удаляем участника
    }

    @Override
    public void notifyObservers() {
        for (Observer participant : participants) {
            participant.update(message);  // Уведомляем всех участников
        }
    }

    // Метод для отправки нового сообщения
    public void sendMessage(String message) {
        this.message = message;  // Устанавливаем новое сообщение
        notifyObservers();  // Уведомляем всех участников
    }
}
