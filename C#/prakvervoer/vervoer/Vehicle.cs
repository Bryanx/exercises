namespace vervoer {
   
    
    public abstract class Vehicle {
        public double Weight { get; private set; }
        public int? Length { get; private set; }
        public int? Height { get; private set; }

     
        public Vehicle(double weight, int? length, int? height) {
            Weight = weight;
            Length = length;
            Height = height;
        }

        public Vehicle(double weight) : this(weight, null, null) {
        }
        
        public virtual string WhatAmI() {
            return "I\'m a vehicle.";
        }

        public abstract string WhoAmI();
    }
}