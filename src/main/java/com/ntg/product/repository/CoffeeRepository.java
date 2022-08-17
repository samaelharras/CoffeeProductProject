package com.ntg.product.repository;

import com.ntg.product.entity.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Long>{

 public Coffee findByName(String name);
	
 
}
