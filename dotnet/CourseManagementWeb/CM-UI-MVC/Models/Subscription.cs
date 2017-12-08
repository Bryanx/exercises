using System;

namespace CM_UI_MVC.Models {
    public class Subscription {
        public int SubscriptionId { get; set; }
        public DateTime SubscriptionDate { get; set; }
        public string Student { get; set; }
        public int CourseId { get; set; }
        
    }
}