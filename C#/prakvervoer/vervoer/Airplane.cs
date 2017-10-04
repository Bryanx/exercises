namespace vervoer {
   
    public class Airplane : Vehicle {

        public Airplane(double weight=175) : base(weight) {
        }

        public override string WhoAmI() {
            return "Dusty";
        }

        public string WhatAmI() {
            return "I\'m an Aerial Firefighters airplane";
        }
    }
}