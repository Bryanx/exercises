package berghutIO;

import berghutIO.Berghut;

import java.io.*;
import java.util.*;

/**
 * De klassen berghutIO.FileHandler bevat 4 static methoden om een tekst/binair bestand in te lezen naar een ArrayList
 * En omgekeerd om een ArrayList weg te schrijven naar een binair/tekst bestand.
 */
public class FileHandler {
    public static List<Berghut> txtFile2List(String bestand) throws IOException {
        List<Berghut> list = new ArrayList<>();
        String regel = "";
        try (BufferedReader br = new BufferedReader(new FileReader(bestand))) {
            while ((regel = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(regel, "#");
                String naam = tokenizer.nextToken();
                int hoogte = Integer.parseInt(tokenizer.nextToken());
                String locatie = tokenizer.nextToken();
                Berghut berghut = new Berghut(naam, hoogte, locatie);
                list.add(berghut);
            }
            Collections.sort(list);
            return list;
        } catch (NoSuchElementException | NumberFormatException e1) {
            throw new IOException("Leesfout in regel: " + regel, e1);
        } catch (IOException e2) {
            throw new IOException("Het bronbestand " + bestand + " kan niet geopend worden", e2);
        }
    }

    public static List<Berghut> binFile2List(String bestand) throws IOException {
        List<Berghut> list = new ArrayList<>();
        try (DataInputStream is = new DataInputStream(new BufferedInputStream(new FileInputStream(bestand)))) {
            try {
                while (true) {
                    String naam = is.readUTF();
                    int hoogte = is.readInt();
                    String locatie = is.readUTF();
                    Berghut berghut = new Berghut(naam, hoogte, locatie);
                    list.add(berghut);
                }
            } catch (EOFException e1) {
                //Alles OK; bestand ten einde
            } catch (IOException e2) {
                throw new IOException("Fout bij het lezen van het bronbestand " + bestand, e2);
            }
            Collections.sort(list);
            return list;
        } catch (IOException e3) {
            throw new IOException("Het bronbestand " + bestand + " kan niet geopend worden", e3);
        }
    }

    public static void list2TxtFile(List<Berghut> list, String bestand) throws IOException {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(bestand)))) {
            for (Berghut hut : list) {
                pw.printf("%s#%d#%s%n", hut.getNaam(), hut.getHoogte(), hut.getLocatie());
            }
        } catch (IOException e) {
            throw new IOException("Problemen bij het wegschrijven naar het doelbestand " + bestand, e);
        }

    }

    public static void list2BinFile(List<Berghut> list, String bestand) throws IOException {
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(bestand)))) {
            for (Berghut hut : list) {
                os.writeUTF(hut.getNaam());
                os.writeInt(hut.getHoogte());
                os.writeUTF(hut.getLocatie());
            }
        } catch (IOException e) {
            throw new IOException("Problemen bij het wegschrijven naar het doelbestand " + bestand, e);
        }
    }
}
