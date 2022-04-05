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
import com.uepb.web.projetoWeb.controller.ProjetoController;
import com.uepb.web.projetoWeb.service.ProjetoService;

//@ExtendWith(MockitoException.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProjetoControllerTest {
	
	private static final String ALUNO_API_URL_PATH = "/api/v1/projetos";
	private static final long VALID_ALUNO_ID = 1L;
	private static final long INVALID_ALUNO_ID = 2L;
	
	private MockMvc mvc;
	
	@Mock
	private ProjetoService projetoService;
	
	@InjectMocks
	private ProjetoController projetoController;
	
	private ObjectMapper objctMapper = new ObjectMapper();	
	
	
	@BeforeEach
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(projetoController).build();
	}
	
	@Test
	public void buscarProjetoPorId() {

		// given

		// when

		// then

	}

	@Test
	public void buscarProjetos() {

		// given

		// when

		// then
	}

	@Test
	public void inserirProjeto() {

		// given

		// when

		// then
	}

	@Test
	public void atualizarProjeto() {

		// given

		// when

		// then

	}

	public void deletarProjeto() {

		// given

		// when

		// then

	}

}
