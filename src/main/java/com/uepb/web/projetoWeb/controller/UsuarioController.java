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

import com.uepb.web.projetoWeb.domain.Projeto;
import com.uepb.web.projetoWeb.domain.Usuario;
import com.uepb.web.projetoWeb.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
		@GetMapping
		public List<Usuario> buscarUsuarios() {
			return usuarioService.buscarUsuario();
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Usuario> buscarAlunoPorId(@PathVariable Long id) { 
			return new ResponseEntity<>(usuarioService.buscarUsuarioPorId(id), HttpStatus.OK);
		}
		
		@PostMapping
		public Usuario inserirAluno(@RequestBody Usuario usuario) {
			return usuarioService.inserirUsuario(usuario);
		}
		
		@PutMapping("/{id}")
		public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
			return usuarioService.atualizarUsuario(id, usuario);
		}
		
		@DeleteMapping("/{id}")
		public void deletarUsuario(@PathVariable Long id) {
			usuarioService.deletarUsuario(id);
		}
		
		public List<Projeto> visualizarProjetos(){
			return usuarioService.visualizarProjetos();
		}


}
