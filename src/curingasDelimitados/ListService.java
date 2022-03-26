package curingasDelimitados;

import java.util.List;

public class ListService {

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        System.out.println("=================");
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.println("=================");
    }
}
