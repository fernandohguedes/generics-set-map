package introducaoInterfaceSet;

import introducaoInterfaceSet.entities.ProductNotHashCodeAndEquals;
import introducaoInterfaceSet.entities.ProductWithHashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class ProgramTestHashCodeImplement {

	public static void main(String[] args) {

		Set<ProductWithHashCodeAndEquals> products = new HashSet<>();
		products.add(new ProductWithHashCodeAndEquals("TV", 900.0));
		products.add(new ProductWithHashCodeAndEquals("Notebook", 1200.00));
		products.add(new ProductWithHashCodeAndEquals("Tablet", 400.0));

		ProductWithHashCodeAndEquals product = new ProductWithHashCodeAndEquals("Notebook", 1200.0);

		boolean verifyProductContains = products.contains(product);
		System.out.println("===========================");
		System.out.println(verifyProductContains);
		System.out.println("===========================");
		System.out.println(product);
		System.out.println("===========================");
		products.forEach(p -> System.out.println(p));
	}
}
