using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace CM_EF.Models {
    
    [ComplexType]
    public class Room {
        [Required]
        public string Number { get; set; }

        public int Seats { get; set; }
    }
}