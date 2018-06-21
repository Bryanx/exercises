package patterns;

import java.util.ArrayList;
import java.util.List;

public class RunDemo {
    public static void main(String[] args) {
        List<Afbeelding> fotos = new ArrayList<>();
        fotos.add(new AfbeeldingProxy("50MB_Foto1"));
        fotos.add(new AfbeeldingProxy("50MB_Foto2"));
        fotos.add(new AfbeeldingProxy("50MB_Foto3"));

        fotos.get(0).toonAfbeelding(); // ophalen noodzakelijk
        fotos.get(1).toonAfbeelding(); // ophalen noodzakelijk
        fotos.get(0).toonAfbeelding(); // reeds opgehaald (tijd bespaard)
    }
}

/*
Ophalen van 50MB_Foto1
Tonen van 50MB_Foto1
Ophalen van 50MB_Foto2
Tonen van 50MB_Foto2
Tonen van 50MB_Foto1
*/