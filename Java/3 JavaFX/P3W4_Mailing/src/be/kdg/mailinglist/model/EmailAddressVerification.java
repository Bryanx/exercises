package be.kdg.mailinglist.model;

import java.util.regex.Pattern;

public class EmailAddressVerification {
    // This isn't a correct pattern according to the standard, but it matches average human-readable addresses.
    private static final Pattern emailAddressPattern = Pattern.compile("^[A-Z][A-Z0-9._]*@[A-Z][A-Z0-9.-]*\\.[A-Z]{2,3}$", Pattern.CASE_INSENSITIVE);

    public static boolean isValidEmailAddress(String address) {
        return emailAddressPattern.matcher(address).matches();
    }
}
