using System.Collections.Generic;

namespace CM_EF.Models {
    public class Student : Person {
        public int Number { get; set; }
        public ICollection<Course> Courses { get; set; }
    }
}