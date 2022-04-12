package introducaoInterfaceSet.entities;


import java.util.Locale;

public class ProductComparableImplement implements Comparable<ProductComparableImplement> {

	private String name;
	private Double price;

	public ProductComparableImplement(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}

	@Override
	public int compareTo(ProductComparableImplement other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}
