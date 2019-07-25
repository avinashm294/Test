package com.project.rentalcarsystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CarRepository  extends JpaRepository<Car, Long>, JpaSpecificationExecutor<Car>{

	public List<Car> findByModelname(String modelname);

	public List<Car> findByCost(String cost);

	public List<Car> findByYear(String year);

	//public List<Car> findByCost_per_day(String cost_per_day);
	
	
}
