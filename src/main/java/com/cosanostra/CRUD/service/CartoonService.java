package com.cosanostra.CRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosanostra.CRUD.model.Cartoon;
import com.cosanostra.CRUD.repo.CartoonRepo;

@Service
public class CartoonService {
	@Autowired
	private CartoonRepo repo;
	
	
	public String addCartoon(Cartoon c) {
		if(c.getId() != null) {
			if(repo.existsById(c.getId())) return c.getCtnName()+" already exists";
		}
		repo.save(c);
		return "cartoon aded successfully";
	}
	
	public List<Cartoon> getAll(){
		return repo.findAll();
	}

	public String updateById(Integer id, Cartoon cartoon) {
		Optional<Cartoon> c = repo.findById(id);
		if(!c.isPresent()) return id+" is an Invalid ID";
		Cartoon ext = c.get();
		ext.setCtnName(cartoon.getCtnName());
		ext.setChanName(cartoon.getChanName());
		repo.save(ext);
		return ext.getCtnName()+" updated and saved in the DB";
	}

	public String deleteById(Integer id) {
		if(!repo.existsById(id)) return id + " is an Invalid ID";
		Optional<Cartoon> opt = repo.findById(id);
		Cartoon c = opt.get();
		String name  = c.getCtnName();
		repo.deleteById(id);
		return name + " Deleted from DB successfully";
	}
	
	
}
