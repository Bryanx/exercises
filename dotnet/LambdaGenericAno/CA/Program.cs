using System;
using System.Collections.Generic;

namespace CA {
    internal class Program {
                
        public static void Main(string[] args) {
            #region Generics

            List<string> list = new List<string>();
            list.Add("Item 1");

            Stack<int> stack = new Stack<int>();
            stack.Push(5);

            Queue<double> queue = new Queue<double>();
            queue.Enqueue(5.6);

            List<string> stuffToBuy = new List<string>() {"item 1", "item 2", "item 3", "item 4"};

//            foreach (string stuf in stuffToBuy) {
//                Console.WriteLine(stuf + " ");
//            }

            #endregion
            
//            Eerste element uit stuffTobuy wordt meegegeven als parameter, daar wordt op gecontroleerd
//            en herhaald.
            var resultaat = stuffToBuy.FindAll(
                delegate(string elementUitLijst) {
                    //Returnt een boolean, als 't true is geeft hij het element terug.
                    return elementUitLijst.Contains("m");
                }
            );
            
            var laatsteResultaat = stuffToBuy.FindLast(
                //delegate verwijst naar niks, methode wordt hier meteen gedeclareerd.
                delegate(string elementUitLijst) {
                    return elementUitLijst.Contains("m");
                }
            );
            
            
            var result = stuffToBuy.FindAll(x => x.Contains("3") || x.Contains("1"));

            bool res = stuffToBuy.Exists(x => x.Equals("naam"));

            foreach (string item in result) {
                Console.WriteLine(item);
            }
            
            
            
            
        }
    }
}