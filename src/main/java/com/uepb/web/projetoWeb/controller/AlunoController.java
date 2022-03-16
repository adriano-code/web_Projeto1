package com.uepb.web.projetoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uepb.web.projetoWeb.domain.Aluno;
import com.uepb.web.projetoWeb.service.AlunoService;

@RestController
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value = "/buscarAlunoPorId", produces = { "application/json" })
	public String buscarAlunoPorId() {
		return alunoService.buscarAlunoPorId();
	}
	
	@PostMapping(value = "/inserirAluno", produces = { "application/json" })
	public String inserirAluno() {
		return alunoService.inserirAluno();
	}
	
	@GetMapping(value = "/buscarAlunos", produces = { "application/json" })
	public List<Aluno> buscarAlunos() {
		return alunoService.buscarAlunos();
	}
	
	@PutMapping(value = "/atualizarAluno", produces = { "application/json" })
	public String atualizarAluno() {
		return alunoService.atualizarAluno();
	}
	
	@DeleteMapping(value = "/deletarAluno", produces = { "application/json" })
	public String deletarAluno() {
		return alunoService.deletarAluno();
	}

}
