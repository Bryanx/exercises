using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;

namespace IM.Domain {
    public class Person {
        [Key]
        public int PersonNumber { get; set; }
        [StringLength(50)]
        public string Name { get; set; }
        public DateTime? BirthDate { get; set; }
        [EmailAddress]
        public string Email { get; set; }
        public ICollection<Immo> Panden { get; set; }
    }
}