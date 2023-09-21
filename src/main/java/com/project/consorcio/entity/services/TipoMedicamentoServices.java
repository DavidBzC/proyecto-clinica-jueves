package com.project.consorcio.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.TipoMedicamento;
import com.project.consorcio.repository.TipoMedicamentoRepository;


@Service
public class TipoMedicamentoServices {

	@Autowired
	
	private TipoMedicamentoRepository repo;
	
	
	public List<TipoMedicamento> listarTodos(){
		return repo.findAll();
	}
	
	/*
	
	public void registrar (TipoMedicamento tipmed){
		repo.save(tipmed);
	}
	
	public void actualizar (TipoMedicamento tipmed){
		repo.save(tipmed);
	}
	
	public void eliminarPorID (Integer cod) {
		repo.deleteById(cod);
	}
	
	public TipoMedicamento buscarPorID (Integer cod) {
		return repo.findById(cod).orElse(null);
	}

	 */
}
