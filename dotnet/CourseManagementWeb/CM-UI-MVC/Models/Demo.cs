namespace CM_UI_MVC.Models {
    public class Demo {
        public string Name { get; set; }
        public int Number { get; set; }

        public override string ToString() {
            return Name + Number;
        }
    }
}