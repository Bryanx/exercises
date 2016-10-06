package peertutor;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 16:56
 */
public class PeerTutor1 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final double MIN_DONATIE = 0.45;
        double maxDonatie;
        char tattoo;
        char geslacht;
        char homo;
        char zwanger;
        int leeftijd;
        char donorStatus;
        char donorHistorie;
        double lengte;
        double gewicht;
        double bloedvolume;

        System.out.print("Heb je de laatste 4 maanden een tatoeage laten zetten? (J/N): ");
        tattoo = keyboardScanner.nextLine().charAt(0);

        if (tattoo == 'J') {
            System.out.println("Sorry U komt niet in aanmerking.");
            return;
        }

        System.out.print("Wat is uw geslacht? (M/V): ");
        geslacht = keyboardScanner.nextLine().charAt(0);

        if (geslacht == 'M') {
            System.out.print("Heeft u seksuele betrekkingen gehad met een andere man? (J/N): ");
            homo = keyboardScanner.nextLine().charAt(0);
            if (homo == 'J') {
                System.out.println("Sorry U komt niet in aanmerking.");
                return;
            } else {
                if (geslacht == 'V') {
                    System.out.print("Bent u zwanger? (J/N): ");
                    zwanger = keyboardScanner.nextLine().charAt(0);

                    if (zwanger == 'J') {
                        System.out.println("Sorry U komt niet in aanmerking.");
                        return;
                    }
                } else {
                    System.out.print("Wat is uw leeftijd?: ");
                    leeftijd = keyboardScanner.nextInt();

                    if (leeftijd < 18) {
                        System.out.println("Sorry U komt niet in aanmerking.");
                        return;
                    } else if (leeftijd > 18) {

                        System.out.print("Heeft u al eens eerder bloed gegeven? (J/N): ");
                        donorStatus = keyboardScanner.next().charAt(0);

                        if (donorStatus == 'N' && leeftijd >= 66) {
                            System.out.print("Sorry U komt niet in aanmerking.");
                            return;
                        } else if (donorStatus == 'J') {
                            System.out.print("Is dit meer dan drie jaar gelden? (J/N): ");
                            donorHistorie = keyboardScanner.next().charAt(0);

                            if (donorHistorie < 3 && leeftijd > 71) {
                                System.out.print("Sorry U komt niet in aanmerking.");
                                return;
                            } else {
                                System.out.print("Wat is uw lengte? (m): ");
                                lengte = keyboardScanner.nextDouble();
                                System.out.print("Wat is uw gewicht? (kg): ");
                                gewicht = keyboardScanner.nextDouble();

                                if (geslacht == 'M') {
                                    bloedvolume = (0.3669 * (Math.pow(lengte, 3))) + (0.03219 * gewicht + 0.6041);
                                    System.out.println("Bloedvolume: " + bloedvolume);
                                    maxDonatie = (bloedvolume / 100 * 13);
                                    System.out.println("Max donatie: " + maxDonatie);
                                    System.out.println("Min donatie: " + MIN_DONATIE);
                                    if (maxDonatie < MIN_DONATIE) {
                                        System.out.println("Je mag GEEN bloed geven");
                                    } else {
                                        System.out.println("Je mag WEL bloed geven");
                                    }
                                } else if (geslacht == 'V') {
                                    bloedvolume = (0.3561 * (Math.pow(lengte, 3))) + (0.03308 * gewicht + 0.1833);
                                    System.out.println("Bloedvolume: " + bloedvolume);
                                    maxDonatie = (bloedvolume / 100 * 13);
                                    System.out.println("Max donatie: " + maxDonatie);
                                    System.out.println("Min donatie: " + MIN_DONATIE);
                                    if (maxDonatie < MIN_DONATIE) {
                                        System.out.println("Je mag GEEN bloed geven");
                                    } else {
                                        System.out.println("Je mag WEL bloed geven");
                                    }
                                }

                            }
                        }


                    }

                }
            }
        }
    }
}
