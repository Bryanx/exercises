
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace IM.Domain {
    public class Immo : IValidatableObject {
        public int Id { get; set; }
        public ImmoType Type { get; set; }
        [Range(1000, 9999)]
        public short Zipcode { get; set; }
        public byte NumberOfBedrooms { get; set; }
        public bool Garage { get; set; }
        public decimal? Price { get; set; }
        public bool Sold { get; set; }
        [Required]
        public Person Eigenaar { get; set; }
        
        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext) {
            List<ValidationResult> errors = new List<ValidationResult>();
            if (Type == ImmoType.Residential && (Garage == true || NumberOfBedrooms > 0)) {
                errors.Add(new ValidationResult("Indien type 'Residential' (= bouwgrond), " +
                                                "kunnen er geen slaapkamers en een garage zijn",
                    new[] {"Type","NumberOfBedrooms", "Garage"}));
            }
            return errors;
        }
    }
}