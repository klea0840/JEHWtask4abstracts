package playrecord;

public class Main {
    public static void main(String[] args) {

        Player playrecord = new Player();
        // Я думаю, что они имели ввиду, что надо использовать все методы.
        playrecord.play();
        playrecord.pause();
        playrecord.play();
        playrecord.stop();

        playrecord.record();
        playrecord.pause();
        playrecord.record();
        playrecord.stop();
    }
}
