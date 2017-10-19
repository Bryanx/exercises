using System;

namespace Lucky7 {
    public class Lucky {
        private Random randomNumberGenerator;
        public readonly int TeRadenGetal = 7;
        public int Gok1 { get; private set; }
        public int Gok2 { get; private set; }
        public int Gok3 { get; private set; }

        public Lucky() {
            this.randomNumberGenerator = new Random();
        }

        public Lucky(int teRadenGetal) {
            this.randomNumberGenerator = new Random();
            this.TeRadenGetal = teRadenGetal;
        }

        public bool Try() {
            this.Gok1 = randomNumberGenerator.Next(1, 10);
            this.Gok2 = randomNumberGenerator.Next(1, 10);
            this.Gok3 = randomNumberGenerator.Next(1, 10);
            
            if (Gok1 == TeRadenGetal ||
                Gok2 == TeRadenGetal ||
                Gok3 == TeRadenGetal) return true;
            return false;
        }
        
        public void Try2(Action<T1,T2,T3>) {
            
        }
    }
}