package composite;

/* Hier niets veranderen!
*/

public interface Component {

  public abstract long getSize();

  public abstract String getPath();

  public abstract void setParent(Directory parent);

  public void add(Component c);

  public void remove(Component c);

}