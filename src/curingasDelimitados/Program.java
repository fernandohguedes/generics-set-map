package curingasDelimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static curingasDelimitados.ListService.copy;
import static curingasDelimitados.ListService.printList;

public class Program {

    public static void main(String[] args) {

        List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myIntegers, myObjects);
        printList(myObjects);

        copy(myDoubles, myObjects);
        printList(myObjects);
    }
}
