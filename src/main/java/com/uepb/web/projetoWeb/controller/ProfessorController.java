package com.uepb.web.projetoWeb.controller;

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

import com.uepb.web.projetoWeb.domain.Aluno;
import com.uepb.web.projetoWeb.domain.Professor;
import com.uepb.web.projetoWeb.domain.Turma;
import com.uepb.web.projetoWeb.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
		@GetMapping
		public List<Professor> buscarProfessores() {
			return professorService.buscarProfessores();
		}
		
		@GetMapping("/{id}")
		public Professor buscarProfessorPorId(@PathVariable Long id) { 
			return professorService.buscarProfessorPorId(id);
		}
		
		@PostMapping
		public Professor inserirProfessor(@RequestBody Professor professor) {
			return professorService.inserirProfessor(professor);
		}
		
		@PutMapping("/{id}")
		public Professor atualizarProfessor(@PathVariable Long id, @RequestBody Professor professor) {
			return professorService.atualizarProfessor(id, professor);
		}
		
		@DeleteMapping("/{id}")
		public void deletarProfessor(@PathVariable Long id) {
			professorService.deletarProfessor(id);
		}

}
