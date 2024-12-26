package zad2;

public class UserInputException extends Exception {
    // Конструктор без параметров
    public UserInputException() {
        super(); // Вызов конструктора родительского класса
    }

    // Конструктор с текстом об ошибке
    public UserInputException(String message) {
        super(message); // Вызов конструктора родительского класса с сообщением
    }
}