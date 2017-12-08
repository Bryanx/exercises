using System;
using System.ComponentModel.DataAnnotations;

namespace CM_UI_MVC.Models {
    public class Course {
        [Display(Name = "Course Number")]
        public int CourseId { get; set; }
        [Required]
        [StringLength(20)]
        public string Name { get; set; }
        [Range(10,50)]
        public int MaxParticipants { get; set; }
        public DateTime? Date { get; set; }
        public double? Price { get; set; }
        
    }
}