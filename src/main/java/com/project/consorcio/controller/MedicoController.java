package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.entity.services.DistritoServices;
import com.project.consorcio.entity.services.EspecialidadServices;
import com.project.consorcio.entity.services.MedicoServices;
import com.project.consorcio.entity.services.SedeServices;

@Controller
@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	private MedicoServices servicioMedic;
	
	@Autowired
	private DistritoServices servicioDistr;
	
	@Autowired
	private EspecialidadServices servicioEspec;
	
	@Autowired
	private SedeServices servicioSede;
	
	
	@RequestMapping("/lista")
	public String index(Model model) {
		model.addAttribute("medico", servicioMedic.listarTodos());
		model.addAttribute("distrito", servicioDistr.listarTodos());
		model.addAttribute("especialidad", servicioEspec.listarTodos());
		model.addAttribute("sede", servicioSede.listarTodos());
		
		return "medico";
	}
	
	
}
