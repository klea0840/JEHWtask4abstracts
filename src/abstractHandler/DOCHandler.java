package abstractHandler;

public class DOCHandler extends AbstractHandler{
    void open() {
        System.out.println("Open DOC");
    }
    void create() {
        System.out.println("Create DOC");
    }
    void change() {
        System.out.println("Change DOC");
    }
    void save() {
        System.out.println("Save DOC");
    }
}
