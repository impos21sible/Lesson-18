package zad1;
import java.net.URI;

public class Practicum {
    public static void main(String[] args) {
        System.out.println(parseStringToURI("https://ya.ru")); // Должно вывести: https://ya.ru
        System.out.println(parseStringToURI("\\\\")); // Должно вывести: null
        System.out.println(parseStringToURI(null)); // Должно вывести: null
    }

    public static URI parseStringToURI(final String input) {
        try {
            return new URI(input);
        } catch (Throwable e) {
            return null;
        }
    }
}

