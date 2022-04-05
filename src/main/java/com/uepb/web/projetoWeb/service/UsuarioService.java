package com.uepb.web.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uepb.web.projetoWeb.domain.Projeto;
import com.uepb.web.projetoWeb.domain.Usuario;
import com.uepb.web.projetoWeb.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ProjetoService projetoService;
	
	public Usuario buscarUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).get();
	}
	
	public List<Usuario> buscarUsuario() {
		return usuarioRepository.findAll();
	}
	
	public Usuario inserirUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario atualizarUsuario(Long id, Usuario usuario) {
		Optional<Usuario> op = usuarioRepository.findById(id);
		if(op.isPresent()) {
			Usuario obj = op.get();
			if(usuario.getNome() != null) {
				obj.setNome(usuario.getNome());
			}
			if(usuario.getProfissao() != null) {
				obj.setProfissao(usuario.getProfissao());
			}
			return usuarioRepository.save(obj);
		}
		return null;
	}
	
	public void deletarUsuario(Long id) {
		if(usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
		}
	}
	
	public List<Projeto> visualizarProjetos(){
		return projetoService.buscarProjetos();
	}


}
