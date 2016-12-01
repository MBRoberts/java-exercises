package validation;

/**
 * Created by M.Ben_Roberts on 11/30/16.
 */
public class NumberIsPositive implements Validation {

    @Override
    public boolean isValid(Object value) {
        return ((int) value > 0) && (value instanceof Integer);
    }

    @Override
    public String errorMessage() {
        return "Must be greater than 0!";
    }
}
