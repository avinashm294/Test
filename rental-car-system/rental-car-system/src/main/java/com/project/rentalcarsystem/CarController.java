package com.project.rentalcarsystem;

import java.util.List;

//import org.sambasoft.entities.User;
//import org.sambasoft.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car-api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class CarController {
	@Autowired
	private CarRepository carRepository;

	@GetMapping("/cars")
	public List<Car> getUsers() {
		return carRepository.findAll();
	}

	@GetMapping("/car/{id}")
	public Car getUser(@PathVariable Long id) {
		return carRepository.findOne(id);
	}
	//car-api/car/1
	
	@GetMapping("/car/modelname/{modelname}")
	public List<Car> searchUserByModelname(@PathVariable String modelname) {
		return carRepository.findByModelname(modelname);
	}
	
	/*@GetMapping("/car/cost_per_day/{cost_per_day}")
	public List<Car> searchUserByCost_per_day(@PathVariable String cost_per_day) {
		return carRepository.findByCost_per_day(cost_per_day);
	}
	*/
	
	
	
	@DeleteMapping("/car/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		carRepository.delete(id);
		return true;
	}

	@PutMapping("/car")
	public Car updateUser(@RequestBody Car car) {
		return carRepository.save(car);
	}

	@PostMapping("/car")
	public Car createUser(@RequestBody Car car) {
		return carRepository.save(car);
	}
	
	@GetMapping("/car/cost/{cost}")
	public List<Car> getCost(@PathVariable String cost) {
		return carRepository.findByCost(cost);
	}
	
	@GetMapping("/car/year/{year}")
	public List<Car> getYear(@PathVariable String year) {
		return carRepository.findByYear(year);
	}
}