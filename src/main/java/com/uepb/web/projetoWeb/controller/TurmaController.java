package com.uepb.web.projetoWeb.controller;

import java.util.List;

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

import com.uepb.web.projetoWeb.domain.Turma;
import com.uepb.web.projetoWeb.service.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

	@Autowired
	private TurmaService turmaService;

	@GetMapping
	public List<Turma> buscarTurmas() {
		return turmaService.buscarTurmas();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Turma> buscarTurmaPorId(@PathVariable Long id) {
		return new ResponseEntity<>(turmaService.buscarTurmaPorId(id), HttpStatus.OK);
	}

	@PostMapping
	public Turma inserirTurma(@RequestBody Turma turma) {
		return turmaService.inserirTurma(turma);
	}

	@PutMapping("/{id}")
	public Turma atualizarTurma(@PathVariable Long id, @RequestBody Turma turma) {
		return turmaService.atualizarTurma(id, turma);
	}

	@DeleteMapping("/{id}")
	public void deletarTurma(@PathVariable Long id) {
		turmaService.deletarTurma(id);
	}

}
