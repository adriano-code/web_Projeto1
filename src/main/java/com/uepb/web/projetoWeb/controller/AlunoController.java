package com.uepb.web.projetoWeb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uepb.web.projetoWeb.domain.Aluno;
import com.uepb.web.projetoWeb.repository.AlunoRepository;
import com.uepb.web.projetoWeb.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	//@GetMapping(value = "/buscarAlunos", produces = { "application/json" })
	@GetMapping
	public List<Aluno> buscarAlunos() {
		return alunoService.buscarAlunos();
	}
	
	//@GetMapping(value = "/buscarAlunoPorId", produces = { "application/json" })
	@GetMapping("/{id}")
	public Aluno buscarAlunoPorId(@PathVariable Long id) { 
		return alunoService.buscarAlunoPorId(id);
	}
	
	//@PostMapping(value = "/inserirAluno", produces = { "application/json" })
	@PostMapping
	public Aluno inserirAluno(@RequestBody Aluno aluno) {
		return alunoService.inserirAluno(aluno);
	}
	
	//@PutMapping(value = "/atualizarAluno", produces = { "application/json" })
	@PutMapping("/{id}")
	public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
		return alunoService.atualizarAluno(id, aluno);
	}
	
	//@DeleteMapping(value = "/deletarAluno", produces = { "application/json" })
	@DeleteMapping("/{id}")
	public void deletarAluno(@PathVariable Long id) {
		alunoService.deletarAluno(id);
	}

}
