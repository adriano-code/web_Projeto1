package com.uepb.web.projetoWeb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> buscarAlunos() {
		return alunoService.buscarAlunos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable Long id) { 
		return new ResponseEntity<>(alunoService.buscarAlunoPorId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public Aluno inserirAluno(@RequestBody Aluno aluno) {
		return alunoService.inserirAluno(aluno);
	}
	
	@PutMapping("/{id}")
	public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
		return alunoService.atualizarAluno(id, aluno);
	}
	
	@DeleteMapping("/{id}")
	public void deletarAluno(@PathVariable Long id) {
		alunoService.deletarAluno(id);
	}

}
