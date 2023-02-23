package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
	StudentRepositary serviceRepository;
@Autowired
studentservice service;

@GetMapping("/getvalues")
List<CrudApplication> getList(){
		return serviceRepository.findAll();
		}
@PostMapping("/post")
public CrudApplication create(@RequestBody CrudApplication stu) {
	return serviceRepository.save(stu);
	}
@GetMapping("/getValues/{id}")
	public Optional<CrudApplication> getbyId(@PathVariable int id){
		return service.getStudent(id);
	}

@PutMapping("/student")
public String update(@RequestBody CrudApplication stu) {
	return service.updateDetails(stu);
	
}
@DeleteMapping("/delete")
public String delete(@RequestParam int id) {
	return service.deleteDetails(id);
}
}


