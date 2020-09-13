package abstractHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter XML, DOC or TXT format: ");
        String format = sc.nextLine();

        // Строки 18-21, 25-28, 32-35 фактически одинаковы.
        // TODO: Посмотреть 4-ую задачу из предыдущего урока.
        switch (format) {
            case "XML":
                AbstractHandler xml = new XMLHandler();
                xml.open();
                xml.save();
                xml.change();
                xml.create();
                break;
            case "DOC":
                AbstractHandler doc = new DOCHandler();
                doc.open();
                doc.save();
                doc.change();
                doc.create();
                break;
            case "TXT":
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.save();
                txt.change();
                txt.create();
                break;
            default:
                System.out.println("Format not supported");
        }
    }
}
