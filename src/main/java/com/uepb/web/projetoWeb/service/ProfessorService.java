package com.uepb.web.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uepb.web.projetoWeb.domain.Professor;
import com.uepb.web.projetoWeb.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepositry;

	public Professor buscarProfessorPorId(Long id) {
		return professorRepositry.findById(id).get();
	}

	public List<Professor> buscarProfessores() {
		return professorRepositry.findAll();
	}

	public Professor inserirProfessor(Professor professor) {
		return professorRepositry.save(professor);
	}

	public Professor atualizarProfessor(Long id, Professor professor) {
		Optional<Professor> op = professorRepositry.findById(id);
		if (op.isPresent()) {
			Professor obj = op.get();
			if (professor.getNome() != null) {
				obj.setNome(professor.getNome());
			}
			if (professor.getFormacao() != null) {
				obj.setFormacao(professor.getFormacao());;
			}
			if (professor.getMatricula() != null) {
				obj.setMatricula(professor.getMatricula());
			}
			if (professor.getEmail() != null) {
				obj.setEmail(professor.getEmail());
			}
			return professorRepositry.save(obj);
		}
		return null;
	}

	public void deletarProfessor(Long id) {
		if (professorRepositry.existsById(id)) {
			professorRepositry.deleteById(id);
		}
	}

}
