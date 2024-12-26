package zad2;


// Главный класс Practicum
public class Practicum {
    public static void main(final String[] args) {
        final UserInputException userInputException = new UserInputException("Ошибка ввода!");
        System.out.println(userInputException.getMessage());

        // Пример использования исключения без параметров
        final UserInputException userInputExceptionWithoutMessage = new UserInputException();
        System.out.println(userInputExceptionWithoutMessage.getMessage()); // Выведет null
    }
}
