package br.com.webstore.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProductDao implements Products {

	private List<Product> products = new ArrayList<>();
	
	public InMemoryProductDao() {
		Product iPhone = new ProductBuilder().withId(1L).called("iPhone").costing(2500d).withDescription("Great iPhone").build();
		Product galaxy = new ProductBuilder().withId(2L).called("Galaxy S4").costing(3100d).withDescription("Great phone").build();
		Product motoX = new ProductBuilder().withId(3L).called("Moto X").costing(3100d).withDescription("Awesome phone").build();
		
		products.add(iPhone);
		products.add(galaxy);
		products.add(motoX);
	}
	
	@Override
	public List<Product> getAll() {
		return products;
	}

}
