import composite.IProjectTask;
import composite.SoftwareProject;

import java.time.LocalDate;

/**
 * Demo van het composite pattern.
 * Hierdoor wordt een geneste, recursieve structuur mogelijk gemaakt waarbij elk SoftwareProject kan bestaan
 * uit ProjectTasks, maar ook uit sub-SoftwareProjects, die op hun beurt bestaan uit ProjectTasks.
 */
public class DemoComposite {
    public static void main(String[] args) {
        IProjectTask task1 = new IProjectTask("Mark", "JUnit tests schrijven", LocalDate.of(2016, 10, 10), 16);
        IProjectTask task2 = new IProjectTask("Linda", "Webservices", LocalDate.of(2016, 10, 5), 4);
        IProjectTask task3 = new IProjectTask("Freddy", "Website frontend", LocalDate.of(2016, 10, 15), 64);

        SoftwareProject subProject = new SoftwareProject("Web applicatie Stad Antwerpen");
        subProject.add(task1);
        subProject.add(task2);
        subProject.add(task3);

        SoftwareProject masterProject = new SoftwareProject("Project Stad Antwerpen");
        masterProject.add(subProject);
        masterProject.add(new IProjectTask("Nancy", "Offerte opmaken", LocalDate.of(2016, 11, 5), 4));

        System.out.println(masterProject);
        System.out.println("Totaal begroot: " + masterProject.getTime() + " uren");
    }
}

/*
OUTPUT:
Project Stad Antwerpen:
[Web applicatie Stad Antwerpen:
[JUnit tests schrijven (Mark) --> 16 hrs, Webservices (Linda) --> 4 hrs, Website frontend (Freddy) --> 64 hrs], Offerte opmaken (Nancy) --> 4 hrs]
Totaal begroot: 88 uren
 */
