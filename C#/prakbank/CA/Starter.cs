using System;
using System.Collections.Generic;

namespace CA {
    internal class Program {
        public static void Main(string[] args) {
            Bankaccount myAccount = new Bankaccount("123-12345-123", 6500.23);
            myAccount += 123.4;
            try {
                myAccount.SubtractMoney(7000);
            } catch (Exception e) {
                Console.WriteLine($"Insufficient amount ({myAccount.Amount}) on bankaccount {myAccount.AccountNumber}");
            }
        }
    }
}