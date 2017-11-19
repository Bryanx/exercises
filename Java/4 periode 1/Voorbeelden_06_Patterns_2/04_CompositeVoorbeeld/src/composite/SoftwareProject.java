package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * De composite-klasse SoftwareProject implementeert de
 * gemeenschappelijke interface IProjectComponent
 * en voegt methoden toe voor het beheer van children
 */

public class SoftwareProject implements IProjectComponent {

	private List<IProjectComponent> projectChildren = new ArrayList<>();
	private String title;

	public SoftwareProject(String title) {
		this.title = title;
	}

	@Override
	public int getTime() {
		int totalTime = 0;
		for (IProjectComponent projectChild : projectChildren) {
			totalTime += projectChild.getTime();
		}
		return totalTime;
	}


	public void add(IProjectComponent component) {
		projectChildren.add(component);
	}


	public void remove(IProjectComponent component) {
		projectChildren.remove(component);
	}


	public IProjectComponent getChild(int index) {
		return projectChildren.get(index);
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return String.format("%s: \n%s", title, projectChildren);
	}
}
