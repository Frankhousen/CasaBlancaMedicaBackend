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

import com.Proyectociclo3Backend.ciclo3.dao.DetalleVentasDAO;
import com.Proyectociclo3Backend.ciclo3.model.DetalleVentas;

@RestController
@RequestMapping ("detalleVentas")
public class DetalleVentasAPI {
	@Autowired
	private DetalleVentasDAO detalleVentasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}
	
	@GetMapping("/listar")
	public List<DetalleVentas> listar(){
		return detalleVentasDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		detalleVentasDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}

	

}
