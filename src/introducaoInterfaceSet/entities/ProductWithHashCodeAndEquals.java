package introducaoInterfaceSet.entities;

import java.util.Objects;

public class ProductWithHashCodeAndEquals {

	private String name;
	private Double price;

	public ProductWithHashCodeAndEquals(String name, Double price) {
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ProductWithHashCodeAndEquals that = (ProductWithHashCodeAndEquals) o;
		return Objects.equals(name, that.name) && Objects.equals(price, that.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public String toString() {
		return "{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
