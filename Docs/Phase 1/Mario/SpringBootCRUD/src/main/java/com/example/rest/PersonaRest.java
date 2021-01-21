package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PersonaDAO;
import com.example.model.Persona;

@RestController
@RequestMapping("persona")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;
	
	@RequestMapping("/create")
	public void create(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	@GetMapping("/read")
	public List<Persona> read(){
		return personaDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		personaDAO.deleteById(id);
	}
	
}
