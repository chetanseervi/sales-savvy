package sales.savvy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sales.savvy.entity.Product;
import sales.savvy.service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/tester")
	 public String tester(String username) {
	  System.out.println("req received: "+username);
	  return "response fron 8080";
	 }
	
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product prod) {
		service.addProduct(prod);
		return "added";
	}
	
	@GetMapping("/searchProduct")
	public Product searchProduct(Long id) {
		return service.searchProduct(id);
	}
	
	@GetMapping("/getAllProduct")
	public List <Product> getAllProduct(){
		return service.getAllProducts();
	}
	
	@PostMapping("/updateProduct")
	public String updateProduct(@RequestBody Product prod) {
		service.updateProduct(prod);
		return "updated";
	}

	@GetMapping("/deleteProduct")
	public void deleteProduct(Long id) {
		service.deleteProduct(id);
	}
}
