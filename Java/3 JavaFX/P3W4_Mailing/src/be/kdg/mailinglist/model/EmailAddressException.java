package be.kdg.mailinglist.model;

public class EmailAddressException extends IllegalArgumentException {
    public EmailAddressException(String msg) {
        super(msg);
    }
}
