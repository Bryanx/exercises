using System;

namespace CA {
    public class Bankaccount {
        public readonly string AccountNumber;
        public double Amount { get; private set; }

        public Bankaccount(string accountNumber, double amount) {
            AccountNumber = accountNumber;
            Amount = amount;
            Console.WriteLine($"New Account {AccountNumber} created with a balance of {Amount}");
        }

        public void AddMoney(double number) {
            Amount += number;
            AmountUpdate(AccountNumber, number, Amount);
        }

        public void SubtractMoney(double number) {
            if (Amount - number < 0) throw new Exception();
            Amount -= number;
            AmountUpdate(AccountNumber, number, Amount);
        }

        public static Bankaccount operator +(Bankaccount bank, double number) {
            bank.Amount = bank.Amount + number;
            AmountUpdate(bank.AccountNumber, number, bank.Amount);
            return bank;
        }
        
        public static Bankaccount operator -(Bankaccount bank, double number) {
            if (bank.Amount - number < 0) throw new Exception();
            bank.Amount = bank.Amount - number;
            AmountUpdate(bank.AccountNumber, number, bank.Amount);
            return bank;
        }

        private static void AmountUpdate(String account, double number, double amount) {
            Console.WriteLine("Amount on account {0} after adding {1} = {2:F2}",
                account, number, amount);
        }
    }
}