package playrecord;

public class Player implements Playable, Recordable {

    public void record() {
        System.out.println("Record");
    }
    // Тут надо обратить внимание, что при использовании через оба интерфейса будет
    // вызываться один и тот же метод. Это здесь верно для pause() и stop(), т.к.
    // у обоих интерфейсов есть такие методы с совпадающими сигнатурами.
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
