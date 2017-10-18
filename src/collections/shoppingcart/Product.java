package collections.shoppingcart;

import java.util.Objects;

public class Product {
	private Integer pid;
	private String name;
	private Double price;
	private Integer Stock;

	public Product() {

	}

	public Product(Integer pid, String name, Double price, Integer Stock) {

		this.pid = pid;
		this.name = name;
		this.price = price;
		this.Stock = Stock;

	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.pid);
		hash = 29 * hash + Objects.hashCode(this.name);
		hash = 29 * hash + Objects.hashCode(this.price);
		hash = 29 * hash + Objects.hashCode(this.Stock);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Product other = (Product) obj;
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.pid, other.pid)) {
			return false;
		}
		if (!Objects.equals(this.price, other.price)) {
			return false;
		}
		if (!Objects.equals(this.Stock, other.Stock)) {
			return false;
		}
		return true;
	}

}
