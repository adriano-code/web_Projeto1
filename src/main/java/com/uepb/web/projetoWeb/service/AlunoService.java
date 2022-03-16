package com.uepb.web.projetoWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uepb.web.projetoWeb.domain.Aluno;
import com.uepb.web.projetoWeb.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public String buscarAlunoPorId() {
		return "AlunoService.buscarAlunoPorId";
	}
	
	public List<Aluno> buscarAlunos() {
		return alunoRepository.findAll();
	}
	
	public String inserirAluno() {
		return "AlunoService.inserirAluno";
	}
	
	public String atualizarAluno() {
		return "AlunoService.atualizarAluno";
	}
	
	public String deletarAluno() {
		return "AlunoService.deletarAluno";
	}

}
