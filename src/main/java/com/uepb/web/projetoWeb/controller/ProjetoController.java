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

import com.uepb.web.projetoWeb.domain.Projeto;
import com.uepb.web.projetoWeb.service.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoService projetoService;

	// @GetMapping(value = "/buscarAlunos", produces = { "application/json" })
	@GetMapping
	public List<Projeto> buscarProjetos() {
		return projetoService.buscarProjetos();
	}

	// @GetMapping(value = "/buscarAlunoPorId", produces = { "application/json" })
	@GetMapping("/{id}")
	public Projeto buscarProjetoPorId(@PathVariable Long id) {
		return projetoService.buscarProjetoPorId(id);
	}

	// @PostMapping(value = "/inserirAluno", produces = { "application/json" })
	@PostMapping
	public Projeto inserirProjeto(@RequestBody Projeto projeto) {
		return projetoService.inserirProjeto(projeto);
	}

	// @PutMapping(value = "/atualizarAluno", produces = { "application/json" })
	@PutMapping("/{id}")
	public Projeto atualizarProjeto(@PathVariable Long id, @RequestBody Projeto projeto) {
		return projetoService.atualizarProjeto(id, projeto);
	}

	// @DeleteMapping(value = "/deletarAluno", produces = { "application/json" })
	@DeleteMapping("/{id}")
	public void deletarProjeto(@PathVariable Long id) {
		projetoService.deletarProjeto(id);
	}

}
