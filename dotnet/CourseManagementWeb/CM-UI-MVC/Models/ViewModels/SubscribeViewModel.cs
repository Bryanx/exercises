using System;
using System.Collections.Generic;

namespace CM_UI_MVC.Models.ViewModels {
    public class SubscribeViewModel {
        public DateTime SubscriptionDate { get; set; }
        public Subscription Subscription { get; set; }
        public List<Course> Courses { get; set; }
    }
}