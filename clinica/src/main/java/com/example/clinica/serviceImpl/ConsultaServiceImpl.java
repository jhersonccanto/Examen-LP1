package com.example.clinica.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clinica.dao.ConsultaDao;
import com.example.clinica.entity.Consulta;
import com.example.clinica.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService{
	@Autowired
	private ConsultaDao dao;
	
	@Override
	public Consulta create(Consulta a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Consulta update(Consulta a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Consulta> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Consulta> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
