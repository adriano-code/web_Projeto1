package com.uepb.web.projetoWeb.controllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uepb.web.projetoWeb.controller.TurmaController;
import com.uepb.web.projetoWeb.service.TurmaService;

//@ExtendWith(MockitoException.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class TurmaControllerTest {
	
	private static final String ALUNO_API_URL_PATH = "/api/v1/turmas";
	private static final long VALID_ALUNO_ID = 1L;
	private static final long INVALID_ALUNO_ID = 2L;
	
	private MockMvc mvc;
	
	@Mock
	private TurmaService turmaService;
	
	@InjectMocks
	private TurmaController turmaController;
	
	private ObjectMapper objctMapper = new ObjectMapper();	
	
	
	@BeforeEach
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(turmaController).build();
	}
	
	@Test
	public void buscarTurmaPorId() {

		// given

		// when

		// then

	}

	@Test
	public void buscarTurmas() {

		// given

		// when

		// then
	}

	@Test
	public void inserirTurma() {

		// given

		// when

		// then
	}

	@Test
	public void atualizarTurma() {

		// given

		// when

		// then

	}

	public void deletarTurma() {

		// given

		// when

		// then

	}

}
