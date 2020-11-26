package com.unab.edu.springdatajpa.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.edu.springdatajpa.DAO.PersonaDao;

@Controller
public class ControllerPersona {
	@Autowired
	private PersonaDao personaDao;
	
	@GetMapping("/")
	public String Inicio() {
		var personas = personaDao.findAll();
		
		for(var consulta:personas) {
			System.out.println(consulta.getNombre());
		}
		
		return "index";
	}
}
