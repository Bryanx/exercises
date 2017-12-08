using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace CM_EF.Models {
    public class Person {
        public int Id { get; set; }
        [Required]
        public string Firstname { get; set; }
        [Required]
        public string Lastname { get; set; }
        [NotMapped]
        public string Name => String.Format("{0} {1}", Firstname, Lastname);
    }
}