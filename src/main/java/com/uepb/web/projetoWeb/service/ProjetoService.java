package com.uepb.web.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uepb.web.projetoWeb.domain.Projeto;
import com.uepb.web.projetoWeb.repository.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;
	

	public Projeto buscarProjetoPorId(Long id) {
		return projetoRepository.findById(id).orElseThrow(null);
	}

	public List<Projeto> buscarProjetos() {
		return projetoRepository.findAll();
	}

	public Projeto inserirProjeto(Projeto projeto) {
		return projetoRepository.save(projeto);

	}

	public Projeto atualizarProjeto(Long id, Projeto projeto) {
		Optional<Projeto> op = projetoRepository.findById(id);
		if (op.isPresent()) {
			Projeto obj = op.get();
			if (projeto.getNome() != null) {
				obj.setNome(projeto.getNome());
			}
			if (projeto.getDescricao() != null) {
				obj.setDescricao(projeto.getDescricao());
			}

			return projetoRepository.save(obj);
		}
		return null;
	}

	public void deletarProjeto(Long id) {
		if (projetoRepository.existsById(id)) {
			projetoRepository.deleteById(id);
		}
	}

}
