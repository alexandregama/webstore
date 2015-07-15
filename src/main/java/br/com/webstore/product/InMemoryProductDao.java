package br.com.webstore.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProductDao implements Products {

	private List<Product> products = new ArrayList<>();
	
	public InMemoryProductDao() {
		Product iPhone = new ProductBuilder().withId(1L).called("iPhone").costing(2500d).withDescription("Great iPhone").witQuantity(9L).build();
		Product galaxy = new ProductBuilder().withId(2L).called("Galaxy S4").costing(3100d).withDescription("Great phone").witQuantity(5L).build();
		Product motoX = new ProductBuilder().withId(3L).called("Moto X").costing(3100d).withDescription("Awesome phone").witQuantity(3L).build();
		
		products.add(iPhone);
		products.add(galaxy);
		products.add(motoX);
	}
	
	@Override
	public List<Product> getAll() {
		return products;
	}

	@Override
	public Product findById(Long id) {
		Product productFound = null;
		for (Product product: products) {
			if (product != null && product.getId().equals(id)) {
				productFound = product;
				break;
			}
		}
		return productFound;
	}

}
