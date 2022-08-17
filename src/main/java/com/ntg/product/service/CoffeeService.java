
package com.ntg.product.service;


import com.ntg.product.entity.Coffee;
import com.ntg.product.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;


@Service
public class CoffeeService {
	@Autowired
	private CoffeeRepository coffeeRepository;
	
		public List<Coffee> getAllCoffee() {
				Iterable<Coffee> productList = coffeeRepository.findAll();
				if(productList != null) {
					return (List<Coffee>) productList;
				}
			return null;
		}

	public Coffee  createNewCoffee(Coffee newCof) {
		
		if (newCof!=null) {
			return coffeeRepository.save(newCof);
			//coffees.add(newEmp);
			//return true;
		}
		return null;
	}

	public boolean  deleteCoffee(Long cofId) {
		if ( cofId != null) {
		
		coffeeRepository.deleteById(cofId);
			
				return true;
			
		}
			
		
		return false;
		
	}

	public Coffee getAllCoffee(String name) {
	
		return coffeeRepository.findByName(name);
	}
	
}
