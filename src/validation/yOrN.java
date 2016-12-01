package validation;

/**
 * Created by M.Ben_Roberts on 11/30/16.
 */
public class yOrN implements Validation {
    @Override
    public boolean isValid(Object value) {
        return value instanceof String && ("y".equalsIgnoreCase((String) value) || "n".equalsIgnoreCase((String) value));
    }

    @Override
    public String errorMessage() {
        return "Please enter Y/N!";
    }
}
