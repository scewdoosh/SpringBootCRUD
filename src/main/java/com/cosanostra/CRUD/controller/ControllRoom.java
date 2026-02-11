package com.cosanostra.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosanostra.CRUD.model.Cartoon;
import com.cosanostra.CRUD.service.CartoonService;


@RestController
@RequestMapping("/api")
public class ControllRoom {
	@Autowired
	private CartoonService cs;
	
	
	 @Value("${server.port}")
	 private String port;
	@GetMapping("/test")
	public String test() {
		System.out.println("application is running on port " + port);
		return "status 200 OK";
	}
	
	@PostMapping("/postcartoon")
	public String putCartoon(@RequestBody Cartoon c) {
		String res = cs.addCartoon(c);
		return res;
	}
	
	@GetMapping("/all")
	public List<Cartoon> getAll(){
		return cs.getAll();
	}
	@PutMapping("/update/{id}")
	public String updateById(@PathVariable Integer id, @RequestBody Cartoon cartoon) {
		return cs.updateById(id,cartoon);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		return cs.deleteById(id);
	}
}
