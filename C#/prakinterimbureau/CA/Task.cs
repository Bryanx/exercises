using System;
using System.Runtime.Remoting.Metadata.W3cXsd2001;

namespace CA {
    public class Task {
        public int TaskId { get; }
        
        public string Description{ get; private set; }
        DateTime Deadline{ get; }
        string Owner { get; set; }

        public Task(string owner) {
            Owner = owner;
            Random rand = new Random();
            TaskId = rand.Next(1,1000);
        }
    }
}