package com.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.model.Customer;
import com.user.service.ICustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/csinfo")
	public String getAllcxData(Map<String,Object> map) {
		List<Customer> csList = service.getAllCustomers();
		map.put("customers", csList);
		csList.forEach(c -> System.out.println(c));
		return "customerinfo";
	}
	
	
	@GetMapping("/showForm")
	public String getForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String registerCx(@ModelAttribute("customer") Customer customer, Model model) {
		
		service.registerCustomer(customer);
		return "redirect:/csinfo";
	}
	
	@GetMapping("/updateCustomer")
	public String UpdateCx(@RequestParam("cxid") Integer id, Model model) {
		
		Customer cx = service.fetchCxById(id);
		model.addAttribute("customer", cx);
		return "updateform";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCx(@RequestParam("cxid") Integer id) {
		
		 service.deleteCustomerById(id);
		
		return "redirect:/csinfo";
	}
	


}


