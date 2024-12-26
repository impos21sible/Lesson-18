package zad5;

import zad5.ValidateException;
import zad5.ValidateNameException;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateException {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}
