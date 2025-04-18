public interface subject {
    void addObserver(Observer observer);  // Добавление наблюдателя
    void removeObserver(Observer observer);  // Удаление наблюдателя
    void notifyObservers();  // Уведомление всех наблюдателей
}

