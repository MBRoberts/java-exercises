package validation;

/**
 * Created by M.Ben_Roberts on 11/29/16.
 */
public interface Validation {
    // It only has public methods
    // No method has an implementation
    // therefore no method has a body

    public boolean isValid(Object value);

    public String errorMessage();

}
