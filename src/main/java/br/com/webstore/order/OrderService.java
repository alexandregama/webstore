package br.com.webstore.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webstore.product.Product;
import br.com.webstore.product.Products;

@Service
public class OrderService {

	@Autowired
	private Products products;
	
	public void processOrder(Long id, Long quantity) {
		Product product = products.findById(id);
		
		if (product.getUnitsInStock() < quantity) {
			throw new RuntimeException("Out of stock. Available units in stock: " + product.getUnitsInStock());
		}
		
		product.removeFromStock(quantity);
	}
	
}
