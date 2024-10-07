package com.example.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.entity.Consulta;
import com.example.clinica.service.ConsultaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {
	@Autowired
	private ConsultaService service;
	@GetMapping
	public ResponseEntity<List<Consulta>> readAll(){
		try {
			List<Consulta> lista = service.readAll();
			if(lista.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else{
				return new ResponseEntity<>(lista, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	@PostMapping
	public ResponseEntity<Consulta> create(@Valid @RequestBody Consulta obj){
			
			try {
				Consulta objeto = service.create(obj);
				return new ResponseEntity<Consulta>(objeto, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
