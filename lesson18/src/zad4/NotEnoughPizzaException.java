package zad4;

public class NotEnoughPizzaException extends Exception {
    public NotEnoughPizzaException(String message) {
        super(message); // Передаем сообщение в конструктор суперкласса
    }
}
