package rectangle;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 15:25
 */
public class Rectangle { // de klasse declaratie of klasse header
    private int x; // EIGENSCHAP  // geen enkle andere klasse kan aan een klasse private!
    private int y; // EIGENSCHAP
    private int height; // EIGENSCHAP
    private int width;  // EIGENSCHAP

    public Rectangle() {
        this(100, 120, 50, 50);
        System.out.println("Eerste constructor");
    }

    public Rectangle(int width, int height) { //CONSTRUCTOR //Door iets in de parameter te zetten verplicht je om bij aanmaak van een object een parameterwaarde mee te geven
        System.out.println("Tweede constructor");
        this.height = Math.abs(width);
        this.width = Math.abs(height);
    }

    public Rectangle(int width, int height, int x, int y) {
        System.out.println("Derde constructor");
        this.height = Math.abs(width);
        this.width = Math.abs(height);
        this.x = x;
        this.y = y;
    }

    //METHODEN
    public int getHeight() {
        return this.height;  // de return is voor een antwoord te geven aan de gebruiker, als die er niet staat wordt er alleen een opdracht uitgevoerd
    }

    public void setHeight(int height) {  // de void staat er voor dat je geen antwoord gaat krijgen
        this.height = Math.abs(height); // door er this.eigenscap van te maken ben je zeker dat het ide eigschap is en vermijd je bugs
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getWidth() {
        return this.width;
    }

    public void setPosition(int x, int y) { // je kan hier twee waarden meegeven, maar je kan geen 2 "gets" tegelijkertijd doen
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void grow(int hoeveelBreeder, int hoeveelHoger) {
        this.width += hoeveelBreeder;
        if (this.width < 0) {
            this.width = 0;
        }
        this.height += hoeveelHoger;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public void grow(int g2) { // je kan hierbij een andere methode aanroepen
        grow(g2, g2);
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return String.format("Rechthoek van %d op %d bevindt zich op locatie (%d,%d)",
                this.width, this.height, this.x, this.y);
    }
}