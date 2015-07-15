package br.com.webstore.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@Autowired
	private Customers customers;
	
	@RequestMapping("/customers")
	public String customers(Model model) {
		List<Customer> customersList = customers.getAll();
		
		model.addAttribute("customers", customersList);
		
		return "customers";
	}
	
}
