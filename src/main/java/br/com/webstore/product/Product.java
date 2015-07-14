package br.com.webstore.product;

import java.math.BigDecimal;

public class Product {

	private Long id;

	private String name;

	private BigDecimal unitPrice;

	private String description;

	private String manufacturer;

	private String category;

	private Long unitsInStock;

	private Long unitsInOrder;

	private boolean discontinued;

	public Product(Long id, String name, BigDecimal unitPrice, String description) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public Long getUnitsInStock() {
		return unitsInStock;
	}

	public Long getUnitsInOrder() {
		return unitsInOrder;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

}
