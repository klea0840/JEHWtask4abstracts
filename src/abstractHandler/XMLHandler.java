package abstractHandler;

public class XMLHandler extends AbstractHandler{
    void open() {
        System.out.println("Open XML");
    }
    void create() {
        System.out.println("Create XML");
    }
    void change() {
        System.out.println("Change XML");
    }
    void save() {
        System.out.println("Save XML");
    }
}
