package br.com.webstore.product;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/products")
	public String list(Model model) {
		Product iPhone = new Product(1L, "iPhone", new BigDecimal(2500));
		
		model.addAttribute("product", iPhone);
		
		return "products";
	}
	
}
