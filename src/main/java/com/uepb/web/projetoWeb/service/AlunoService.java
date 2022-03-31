package com.uepb.web.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uepb.web.projetoWeb.domain.Aluno;
import com.uepb.web.projetoWeb.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno buscarAlunoPorId(Long id) {
		return alunoRepository.findById(id).get();
	}
	
	public List<Aluno> buscarAlunos() {
		return alunoRepository.findAll();
	}
	
	public Aluno inserirAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno atualizarAluno(Long id, Aluno aluno) {
		Optional<Aluno> op = alunoRepository.findById(id);
		if(op.isPresent()) {
			Aluno obj = op.get();
			if(aluno.getNome() != null) {
				obj.setNome(aluno.getNome());
			}
			if(aluno.getMatricula() != null) {
				obj.setMatricula(aluno.getMatricula());
			}
			if(aluno.getEmail() != null) {
				obj.setEmail(aluno.getEmail());
			}
			return alunoRepository.save(obj);
		}
		return null;
	}
	
	public void deletarAluno(Long id) {
		if(alunoRepository.existsById(id)) {
			alunoRepository.deleteById(id);
		}
	}

}
