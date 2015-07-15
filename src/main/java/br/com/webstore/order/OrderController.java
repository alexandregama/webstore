package br.com.webstore.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@Autowired
	private OrderService order;
	
	@RequestMapping("/orders/1")
	public String process() {
		order.processOrder(1L, 3L);
		
		return "redirect:/products";
	}
	
}
