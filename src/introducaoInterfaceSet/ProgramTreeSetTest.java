package introducaoInterfaceSet;

import introducaoInterfaceSet.entities.ProductComparableImplement;

import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSetTest {

	public static void main(String[] args) {

		Set<ProductComparableImplement> products = new TreeSet<>();
		products.add(new ProductComparableImplement("TV", 900.0));
		products.add(new ProductComparableImplement("Caderno", 900.0));
		products.add(new ProductComparableImplement("Notebook", 1200.00));
		products.add(new ProductComparableImplement("Tablet", 400.0));
		products.add(new ProductComparableImplement("Avião", 1000.0));
		products.add(new ProductComparableImplement("Barco", 1000.0));


		products.forEach(p -> System.out.println(p));
	}


}
