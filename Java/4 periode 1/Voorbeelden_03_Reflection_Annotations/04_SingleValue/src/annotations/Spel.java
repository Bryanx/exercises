package annotations;

import java.util.Collections;
import java.util.List;

public class Spel {
    // ...

    public void startSpel() {
        // ...
    }

    @Unfinished(value = "Uitwerken login")
    public void login(String user, char[] passWord) {
        // nog uitwerken
    }

    @Unfinished("Uitwerken topscores")
    public List<String> getTopscores() {
        // nog uitwerken
        return Collections.emptyList();
    }

}

