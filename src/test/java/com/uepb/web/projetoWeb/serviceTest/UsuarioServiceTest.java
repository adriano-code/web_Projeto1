package com.uepb.web.projetoWeb.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uepb.web.projetoWeb.repository.UsuarioRepository;
import com.uepb.web.projetoWeb.service.UsuarioService;


public class UsuarioServiceTest {
	
	@Mock
	private UsuarioRepository usuarioRepository;
	
	@InjectMocks
	private UsuarioService usuarioService;
	
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void buscarUsuarioPorId() {

		// given

		// when

		// then

	}

	@Test
	public void buscarUsuarios() {

		// given

		// when

		// then
	}

	@Test
	public void inserirUsuario() {

		// given

		// when

		// then
	}

	@Test
	public void atualizarUsuario() {

		// given

		// when

		// then

	}

	@Test
	public void deletarUsuario() {

		// given

		// when

		// then

	}
	
	@Test
	public void visualizarProjetos() {

		// given

		// when

		// then

	}
	
	

}
