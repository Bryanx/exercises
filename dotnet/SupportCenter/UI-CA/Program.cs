using System;
using SC.BL;
using SC.BL.Domain;
using SC.UI.CA.ExtensionMethods;

namespace SC.UI.CA {
    class Program {
        private static bool quit = false;
        private static readonly ITicketManager mgr = new TicketManager();


        public static void Main(string[] args) {
            while (!quit)
                ShowMenu();
        }

        private static void ShowMenu() {
            Console.WriteLine("=================================");
            Console.WriteLine("=== HELPDESK - SUPPORT CENTER ===");
            Console.WriteLine("=================================");
            Console.WriteLine("1) Toon alle tickets");
            Console.WriteLine("2) Maak een nieuw ticket");
            Console.WriteLine("0) Afsluiten");
            DetectMenuAction();
        }

        private static void DetectMenuAction() {
            bool inValidAction;
            do {
                inValidAction = false;
                Console.Write("Keuze: ");
                if (Int32.TryParse(Console.ReadLine(), out int action)) {
                    switch (action) {
                        case 1:
                            PrintAllTickets();
                            break;
                        case 2:
                            ActionCreateTicket();
                            break;
                        case 0:
                            quit = true;
                            return;
                        default:
                            Console.WriteLine("Geen geldige keuze!");
                            inValidAction = true;
                            break;
                    }
                }
            } while (inValidAction);
        }

        private static void PrintAllTickets() {
            foreach (var t in mgr.GetTickets())
                Console.WriteLine(t.GetInfo());
        }

        private static void ActionCreateTicket() {
            string device = "";
            Console.Write("Is het een hardware probleem (j/n)? ");
            bool isHardwareProblem = (Console.ReadLine().ToLower() == "j");
            if (isHardwareProblem) {
                Console.Write("Naam van het toestel: ");
                device = Console.ReadLine();
            }
            Console.Write("Gebruikersnummer: ");
            int accountNumber = Int32.Parse(Console.ReadLine());
            Console.Write("Probleem: ");
            string problem = Console.ReadLine();
            if (!isHardwareProblem)
                mgr.AddTicket(accountNumber, problem);
            else
                mgr.AddTicket(accountNumber, device, problem);
        }
    }
}