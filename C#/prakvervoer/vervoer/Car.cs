namespace vervoer {
    public class Car : Vehicle {
        
        public Car(int length, int height = 180, double weight = 1.5) : base(weight, length, height) {
        }

        public override string WhoAmI() {
            return "Lightning McQueen";
        }

        public string WhatAmI() {
            return "I\'m a sports car";
        }
    }
}