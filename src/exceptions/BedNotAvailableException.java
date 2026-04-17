package exceptions;

public class BedNotAvailableException extends RuntimeException {
    public BedNotAvailableException(String message) {
        super(message);
    }
}
