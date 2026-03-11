package seedu.address.model.person;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidRemark(String)}
 */
public class Remark {

    public final String value;

    /**
     * Constructs a {@code Remark}.
     */
    public Remark(String remark) {
        value = remark;
    }

    /**
     * Returns true if a given string is a valid remark.
     */
    public static boolean isValidRemark(String test) {
        return true; // no constraints
    }

    @Override
    public String toString() {
        return value;
    }

}