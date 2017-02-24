package be.kdg.mailinglist.model;

public class EmailAddress implements Comparable<EmailAddress> {
    private final String address;

    public EmailAddress(String address) {
        if (EmailAddressVerification.isValidEmailAddress(address)) {
            this.address = address;
        }
        else {
            throw new EmailAddressException("Invalid email address: \"" + address + "\".");
        }
    }

    @Override
    public String toString() {
        return this.address;
    }

    @Override
    public int compareTo(EmailAddress o) {
        return this.address.compareTo(o.address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailAddress that = (EmailAddress) o;

        return address.equals(that.address);

    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }
}
