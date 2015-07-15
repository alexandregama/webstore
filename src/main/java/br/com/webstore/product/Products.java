package br.com.webstore.product;

import java.util.List;

public interface Products {

	List<Product> getAll();
	
	Product findById(Long id);
	
}
