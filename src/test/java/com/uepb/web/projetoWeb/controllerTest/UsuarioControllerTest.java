package com.uepb.web.projetoWeb.controllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uepb.web.projetoWeb.controller.UsuarioController;
import com.uepb.web.projetoWeb.service.UsuarioService;


//@ExtendWith(MockitoException.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class UsuarioControllerTest {
	
	private static final String ALUNO_API_URL_PATH = "/api/v1/usuarios";
	private static final long VALID_ALUNO_ID = 1L;
	private static final long INVALID_ALUNO_ID = 2L;
	
	private MockMvc mvc;
	
	@Mock
	private UsuarioService usuarioService;
	
	@InjectMocks
	private UsuarioController usuarioController;
	
	private ObjectMapper objctMapper = new ObjectMapper();	
	
	
	@BeforeEach
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(usuarioController).build();
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
