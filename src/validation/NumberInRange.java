package validation;

/**
 * Created by M.Ben_Roberts on 11/29/16.
 */

public class NumberInRange implements Validation {

    private final int min;
    private final int max;

    public NumberInRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isValid(Object value) {
        return (value instanceof Integer) && (min < (int) value) && ((int) value < max);
    }

    @Override
    public String errorMessage() {
        return "Number must be between " + min + " and " + max;
    }
}
