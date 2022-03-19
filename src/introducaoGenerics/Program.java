package introducaoGenerics;

import introducaoGenerics.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exemplo de implementação com o tipo Integer
        PrintService<Integer> printServiceInteger = new PrintService<>();

        System.out.println("How many values? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = scanner.nextInt();
            printServiceInteger.addValue(value);
        }

        printServiceInteger.print();
        printServiceInteger.printFirst();

        System.out.println("===========================================================");

        // Exemplo de implementação com o tipo String
        PrintService<String> printServiceString = new PrintService<>();

        System.out.println("How many values? ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            printServiceString.addValue(value);
        }

        printServiceString.print();
        printServiceString.printFirst();

        scanner.close();
    }
}
