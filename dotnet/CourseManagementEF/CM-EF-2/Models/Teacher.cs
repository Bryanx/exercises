using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace CM_EF.Models {
    public class Teacher : Person {
        public DateTime? StartedOn{ get; set; }
        public ICollection<Course> Courses { get; set; }
    }
}