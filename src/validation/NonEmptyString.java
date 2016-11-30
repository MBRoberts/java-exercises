package validation;

/**
 * Created by M.Ben_Roberts on 11/29/16.
 */

public class NonEmptyString implements Validation {
    @Override
    public boolean isValid(Object value) {
        return (value instanceof String) && !((String) value).trim().isEmpty();
    }

    @Override
    public String errorMessage() {
        return "Cannot be empty";
    }
}
