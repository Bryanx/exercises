using System;

namespace Calculator.CA
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculator mijnRekenmachine = new Calculator();
            Random r = new Random();

            Console.WriteLine("*** Work with caluclator JV Instruments 007 ***");
            int batteryLevel = 10;
            try
            {
                for (int i = 0; i < 5; i++)
                {
                    int nbr1 = r.Next(10);
                    int nbr2 = r.Next(10);
                    mijnRekenmachine.Add(nbr1, nbr2);
                    batteryLevel--;
                    if (batteryLevel == 0) throw new InvalidOperationException("Battery needs to be recharged");
                    mijnRekenmachine.Multiply(nbr1, nbr2);
                    batteryLevel--;
                    if (batteryLevel == 0) throw new InvalidOperationException("Battery needs to be recharged");
                }

                mijnRekenmachine.Add(2, 3); //Forceer een exception
                batteryLevel--;
                if (batteryLevel == 0) throw new InvalidOperationException("Battery needs to be recharged");
            }
            catch (InvalidOperationException ieo)
            {
                Console.WriteLine(ieo.Message);
            }
            Console.ReadLine();
        }


    }
}
