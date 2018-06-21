package composite;

/**
 * Gemeenschappelijke interface voor zowel de leaf-klasse (IProjectTask)
 * als voor de composite-klasse (SoftwareProject)
 */

public interface IProjectComponent {
    int getTime();
}
