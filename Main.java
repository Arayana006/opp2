public class Main {
    public static void main(String[] args) {
        chatroom chatroom = new chatroom();  // Создаем комнату чата

        User user1 = new User("Иван");
        User user2 = new User("Мария");

        chatroom.addObserver(user1);  // Подписываем участников
        chatroom.addObserver(user2);

        // Отправляем новое сообщение, все участники получат уведомление
        chatroom.sendMessage("Привет, как дела?");

        chatroom.removeObserver(user1);  // Убираем одного участника

        // Отправляем еще одно сообщение
        chatroom.sendMessage("Как настроение?");
    }
}
