package com.ntg.product.controller;

import com.ntg.product.entity.Coffee;
import com.ntg.product.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cof/v1")
public class CoffeeController {

	@Autowired
	private CoffeeService coffeeService;
	@GetMapping(value="/all")
	public List<Coffee> getAllCoffee(){
		
		return coffeeService . getAllCoffee();
	}
	
	@GetMapping(value="/getByName{name}")
	public Coffee getCoffeeByName(@PathVariable String name){
		
		return coffeeService . getAllCoffee(name);
	}
	
	
	

	

	@PostMapping(value="/add" )
	public Coffee createNewCoffee(@RequestBody Coffee newCoffee) {
		return coffeeService .createNewCoffee(newCoffee);
	}
	
	@DeleteMapping(value="/del/{cofId}")
	public boolean deleteCmployee(@PathVariable long cofId) {
		return coffeeService .deleteCoffee(cofId);
	}
}
