package annotations;

import java.util.Collections;
import java.util.List;

public class Spel {
    // ...

    public void startSpel() {
        // ...
    }

    @Unfinished(belangrijkheid = Unfinished.Belangrijkheid.KRITIEK, toDo = "Uitwerken login", eindDatum = "01/11/16")
    public void login(String user, char[] passWord) {
        // nog uitwerken
    }

    @Unfinished(belangrijkheid = Unfinished.Belangrijkheid.GEWOON, toDo = "Uitwerken topscores", eindDatum = "01/12/16")
    public List<String> getTopscores() {
        // nog uitwerken
        return Collections.emptyList();
    }

}

