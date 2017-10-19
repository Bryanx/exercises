package be.kdg.opgave;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MijnAnnotatie {
    String string();

    int waarde();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Wat {
    String omschrijving();
}