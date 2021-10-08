package com.Proyectociclo3Backend.ciclo3.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Proyectociclo3Backend.ciclo3.dao.UsuariosDAO;
import com.Proyectociclo3Backend.ciclo3.model.Usuarios;

@RestController
@RequestMapping ("usuarios")

public class UsuariosAPI {
	
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuariosDAO.save(usuarios);		
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuariosDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") long id) {
		usuariosDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody Usuarios usuarios) {
		usuariosDAO.save(usuarios);
	}

}
