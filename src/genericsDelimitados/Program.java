package genericsDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        String path = "definir um caminho de arquivo";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product productMax = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(productMax);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
