package be.kdg.opgave;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo {
    public void demoMethode() {

        MijnKlasse mijnKlasse = new MijnKlasse();
        // Toon alle annotaties voor de klasse be.kdg.opgave.MijnKlasse.
        toonClassAnnotations(mijnKlasse);
        // Toon de waarden van de Class-annotaties
        toonWaardenClassAnnotation(mijnKlasse);
        // Toon alle annotaties voor demoMethode uit be.kdg.opgave.MijnKlasse .
        toonMethodeAnnotations(mijnKlasse);
        // Toon alle waarden van de Methode-annotaties uit be.kdg.opgave.MijnKlasse
        toonWaardenMethodeAnnotation(mijnKlasse);
    }

    private void toonWaardenMethodeAnnotation(MijnKlasse mijnKlasse) {
        System.out.println("Alle parameters:");
        Class klasse = mijnKlasse.getClass();
        for (Method method : klasse.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                int i = annotation.toString().indexOf('=');
                System.out.println(annotation.toString().substring(i+1));
            }
        }

    }

    private void toonMethodeAnnotations(MijnKlasse mijnKlasse) {
        System.out.println("Alle annotaties voor demoMethode:");
        Class klasse = mijnKlasse.getClass();
        for (Method method : klasse.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println(annotation);
            }
        }
    }

    private void toonWaardenClassAnnotation(MijnKlasse mijnKlasse) {
        System.out.println("Alle parameters: ");
        Class klasse = mijnKlasse.getClass();
        for (Annotation annotation : klasse.getAnnotations()) {
            int i = annotation.toString().indexOf('=');
            System.out.println(annotation.toString().substring(i+1));
        }
    }

    private void toonClassAnnotations(MijnKlasse mijnKlasse) {
        System.out.println("Alle annotaties voor MijnKlasse: ");
        Class klasse = mijnKlasse.getClass();
        for (Annotation annotation : klasse.getAnnotations()) {
            System.out.println(annotation);
        }
    }
}