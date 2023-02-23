package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentservice {
	@Autowired
	StudentRepositary repository;
	
public Optional<CrudApplication> getStudent(int id){
	return repository.findById(id);
	
}
public String updateDetails(CrudApplication stu) {
	repository.save(stu);
	return "updated";
}
public String deleteDetails(int id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
	return "DELETED";
}

}

