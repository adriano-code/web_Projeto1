package com.uepb.web.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uepb.web.projetoWeb.domain.Turma;
import com.uepb.web.projetoWeb.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository turmaRepository;

	public Turma buscarTurmaPorId(Long id) {
		return turmaRepository.findById(id).get();
	}

	public List<Turma> buscarTurmas() {
		return turmaRepository.findAll();
	}

	public Turma inserirTurma(Turma turma) {
		return turmaRepository.save(turma);
	}

	public Turma atualizarTurma(Long id, Turma turma) {
		Optional<Turma> op = turmaRepository.findById(id);
		if (op.isPresent()) {
			Turma obj = op.get();
			if (turma.getNomeDaDisciplina() != null) {
				obj.setNomeDaDisciplina(turma.getNomeDaDisciplina());
			}
			if (turma.getSala() != null) {
				obj.setSala(turma.getSala());
			}
			return turmaRepository.save(obj);
		}
		return null;
	}

	public void deletarTurma(Long id) {
		if (turmaRepository.existsById(id)) {
			turmaRepository.deleteById(id);
		}
	}

}
