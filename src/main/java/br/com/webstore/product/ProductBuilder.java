package br.com.webstore.product;

import java.math.BigDecimal;

public class ProductBuilder {

	private Long id;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	
	public ProductBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public ProductBuilder called(String name) {
		this.name = name;
		return this;
	}

	public ProductBuilder costing(Double price) {
		this.unitPrice = new BigDecimal(price);
		return this;
	}

	public ProductBuilder withDescription(String description) {
		this.description = description;
		return this;
	}

	public Product build() {
		return new Product(id, name, unitPrice, description);
	}

}
