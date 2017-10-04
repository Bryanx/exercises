using System;
using System.Collections;
using System.Collections.Generic;

namespace vervoer {
    internal class Program {
        public static void Main(string[] args) {
            Car car = new Car(250);
            Airplane airplane = new Airplane();
            ArrayList listTransport = new ArrayList();
            listTransport.Add(car);
            listTransport.Add(airplane);
            foreach (Vehicle v in listTransport) {
                Console.WriteLine($"My name is {v.WhoAmI()} and {v.WhatAmI()}");
            }
        }
    }
}