package introducaoInterfaceSet;

import introducaoInterfaceSet.entities.ProductNotHashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class ProgramTestHashCodeNotImplement {

	public static void main(String[] args) {

		Set<ProductNotHashCodeAndEquals> products = new HashSet<>();
		products.add(new ProductNotHashCodeAndEquals("TV", 900.0));
		products.add(new ProductNotHashCodeAndEquals("Notebook", 1200.00));
		products.add(new ProductNotHashCodeAndEquals("Tablet", 400.0));

		ProductNotHashCodeAndEquals product = new ProductNotHashCodeAndEquals("Notebook", 1200.0);

		boolean verifyProductContains = products.contains(product);
		System.out.println("===========================");
		System.out.println(verifyProductContains);
		System.out.println("===========================");
		System.out.println(product);
		System.out.println("===========================");
		products.forEach(p -> System.out.println(p));
	}
}
