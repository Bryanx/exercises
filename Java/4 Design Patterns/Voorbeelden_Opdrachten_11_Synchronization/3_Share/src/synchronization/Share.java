package synchronization;

public class Share extends Thread {

    private Show show;

    public Share(String name, Show display) {
        super(name);
        this.show = display;
    }

    public void run() {
        show.display(super.getName());
    }
}
