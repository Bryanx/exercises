using System;
using System.Collections.Generic;
using System.Linq;
using IM.BL;
using IM.Domain;
using IM.UI.CA.ExtensionMethods;

namespace UI_CA {
    internal class Program {
        private static ImmoManager manager = new ImmoManager();

        public static void Main(string[] args) {
            int input = 6;
            while (input != 0) {
                Console.WriteLine("=========================================");
                Console.WriteLine("=========== IMMO DATABASE MENU ==========");
                Console.WriteLine("=========================================");
                Console.WriteLine("1) Toon alle personen");
                Console.WriteLine("2) Toon alle eigendommen");
                Console.WriteLine("3) Toon te koop");
                Console.WriteLine("4) Toon alle eigendommen van een bepaald type");
                Console.WriteLine("5) Toon de details van een eigendom");
                Console.WriteLine("6) Wijzig de prijs van een eigendom");
                Console.WriteLine("7) Wijzig eigendom naar verkocht");
                Console.WriteLine("8) Nieuwe eigendom");
                Console.WriteLine("9) Verwijder een persoon");
                Console.WriteLine("0) Exit");
                if (Int32.TryParse(Console.ReadLine(), out int uitvoer)) {
                    input = Menu(uitvoer);
                } else Console.WriteLine("Geen geldige invoer.");
            }
        }

        private static int Menu(int input) {
            switch (input) {
                case 1:
                    PrintPersons(manager.GetPersons().ToList());
                    break;
                case 2:
                    PrintImmos(manager.GetImmos().ToList());
                    break;
                case 3:
                    PrintImmos(manager.GetImmosBySold(false).ToList());
                    break;
                case 4:
                    ShowProperties();
                    break;
                case 5:
                    ShowPropertyById();
                    break;
                case 6:
                    ChangePrice();
                    break;
                case 7:
                    GetImmoBySold();
                    break;
                case 8:
                    MakeImmo();
                    break;
                case 9:
                    ClearImmo();
                    break;
                case 0:
                    Console.WriteLine("Bye.");
                    return 0;
            }
            return input;
        }

        private static void ClearImmo() {
            PrintPersons(manager.GetPersons().ToList());
            Console.WriteLine("Geef het gewenste id: ");
            if (Int32.TryParse(Console.ReadLine(), out int id6)) {
                manager.RemovePerson(id6);
                Console.WriteLine("Verwijdert.");
                PrintImmos(manager.GetImmos().ToList());
                PrintPersons(manager.GetPersons().ToList());
            } else Console.WriteLine("Geen geldige invoer.");
        }

        private static void MakeImmo() {
            Immo newImmo = new Immo();
            Console.WriteLine("Geef het gewenste type: ");
            if (ImmoType.TryParse(Console.ReadLine(), out ImmoType type)) {
                newImmo.Type = type;
                Console.WriteLine("Geef de gewenste zipcode: ");
                if (short.TryParse(Console.ReadLine(), out short zip)) {
                    newImmo.Zipcode = zip;
                    Console.WriteLine("Geef de gewenste NumberOfBedrooms: ");
                    if (byte.TryParse(Console.ReadLine(), out byte nr)) {
                        newImmo.NumberOfBedrooms = nr;
                        Console.WriteLine("Garage? true/false: ");
                        if (Boolean.TryParse(Console.ReadLine(), out bool gar)) {
                            newImmo.Garage = gar;
                            Console.WriteLine("Geef de gewenste price: ");
                            if (Int32.TryParse(Console.ReadLine(), out int p)) {
                                newImmo.Price = p;
                                Console.WriteLine("Is het al verkocht?: ");
                                if (Boolean.TryParse(Console.ReadLine(), out bool sold)) {
                                    newImmo.Sold = sold;
                                    Console.WriteLine("Wie is de eigenaar? (id): ");
                                    if (Int32.TryParse(Console.ReadLine(), out int id4)) {
                                        manager.GetPersons().ToList().ForEach(own => {
                                            if (own.PersonNumber == id4) newImmo.Eigenaar = own;
                                        });
                                        manager.CreateImmo(newImmo);
                                        Console.WriteLine("new Immo created.");
                                    } else Console.WriteLine("Geen geldige invoer.");
                                } else Console.WriteLine("Geen geldige invoer.");
                            } else Console.WriteLine("Geen geldige invoer.");
                        } else Console.WriteLine("Geen geldige invoer.");
                    } else Console.WriteLine("Geen geldige invoer.");
                } else Console.WriteLine("Geen geldige invoer.");
            } else Console.WriteLine("Geen geldige invoer.");
        }

        private static void GetImmoBySold() {
            List<Int32> opties = new List<int>();
            manager.GetImmosBySold(false).ToList().ForEach(i => {
                Console.WriteLine(i.Summary());
                opties.Add(i.Id);
            });
            Console.WriteLine("Geef het gewenste id uit de lijst van opties: ");
            if (Int32.TryParse(Console.ReadLine(), out int id3) && opties.Contains(id3)) {
                manager.GetImmo(5).Sold = true;
                manager.ChangeImmoToSold(id3);
                Console.WriteLine(manager.GetImmo(id3).Details());
            } else Console.WriteLine("Geen geldige invoer.");
        }

        private static void ChangePrice() {
            Console.WriteLine("Geef het gewenste id: ");
            if (Int32.TryParse(Console.ReadLine(), out int id2)) {
                Immo deImmo = manager.GetImmo(id2);
                Console.WriteLine(deImmo.Details());
                Console.WriteLine("\nGeef de nieuwe prijs: ");
                if (Int32.TryParse(Console.ReadLine(), out int prijs)) {
                    deImmo.Price = prijs;
                    manager.ChangeImmo(deImmo);
                    Console.WriteLine(deImmo.Details());
                } else Console.WriteLine("Geen geldige invoer.");
            } else Console.WriteLine("Geen geldige invoer.");
        }

        private static void ShowPropertyById() {
            Console.WriteLine("Geef het gewenste id van het eigendom:");
            if (Int32.TryParse(Console.ReadLine(), out int id))
                Console.WriteLine(manager.GetImmo(id).Details());
            else Console.WriteLine("Geen geldige invoer.");
        }

        private static void ShowProperties() {
            Console.WriteLine("Geef het gewenste Immo type");
            if (Enum.TryParse(Console.ReadLine(), out ImmoType type2))
                PrintImmos(manager.GetImmosByType(type2).ToList());
            else Console.WriteLine("Geen geldig type.");
        }

        private static void PrintImmos(List<Immo> eigendommen) {
            foreach (var eigendom in eigendommen) {
                Console.WriteLine(eigendom?.Summary());
            }
        }

        private static void PrintPersons(List<Person> persons) {
            foreach (var person in persons) {
                Console.WriteLine(person?.Summary());
            }
        }
    }
}