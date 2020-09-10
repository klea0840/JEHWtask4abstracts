package playrecord;

public class Player implements Playable, Recordable {

    public void record() {
        System.out.println("Record");
    }
    public void pause() {
        System.out.println("Pause");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void play() {
        System.out.println("Play");
    }
}
