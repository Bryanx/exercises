import composite.*;

/* OPGAVE: Hanteer het Composite pattern om volgende opgave uit te werken:
 * Gegeven: de abstracte klasse Component en de klasse Client.
 * Gevraagd: werk de klassen File en Directory uit. Beide klassen gebruiken de
 * klasse Component. Een Directory-object kan andere Componenten bevatten;
 * een File-object natuurlijk niet.
 * De verwachte afdruk staat onderaan.
*/

public class Client {
  public static void main(String[] args) {
    Component dir1 = new Directory("C:");
    Component dir2 = new Directory("My Documents");
    Component dir3 = new Directory("Word");
    Component dir4 = new Directory("Excel");
    Component file1 = new File("Document1", 250);
    Component file2 = new File("Picture1", 410);
    Component file3 = new File("Sheet1", 175);

    dir1.add(dir2);
    dir1.add(file1);
    dir2.add(dir3);
    dir2.add(dir4);
    dir3.add(file1);
    dir4.add(file3);
    dir2.add(file2);

    System.out.println("Path: " + file3.getPath());
    System.out.println("Size: " + file3.getSize());
    System.out.println("toString: " + file3);

    System.out.println("\n" + dir3);
    System.out.println(file1);
    System.out.println(dir2);
  }
}
/* AFDRUK:

Path: C:\My Documents\Excel\Sheet1
Size: 175
toString: C:\My Documents\Excel\Sheet1 (175kb)

C:\My Documents\Word (250kb)
C:\My Documents\Word\Document1 (250kb)
C:\My Documents (835kb)
*/