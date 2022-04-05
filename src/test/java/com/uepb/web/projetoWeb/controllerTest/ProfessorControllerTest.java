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
import com.uepb.web.projetoWeb.controller.ProfessorController;
import com.uepb.web.projetoWeb.service.ProfessorService;

//@ExtendWith(MockitoException.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProfessorControllerTest {
	
	private static final String ALUNO_API_URL_PATH = "/api/v1/professores";
	private static final long VALID_ALUNO_ID = 1L;
	private static final long INVALID_ALUNO_ID = 2L;
	
	private MockMvc mvc;
	
	@Mock
	private ProfessorService professorService;
	
	@InjectMocks
	private ProfessorController professorController;
	
	private ObjectMapper objctMapper = new ObjectMapper();	
	
	
	@BeforeEach
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(professorController).build();
	}
	
	@Test
	public void buscarProfessorPorId() {

		// given

		// when

		// then

	}

	@Test
	public void buscarProfessores() {

		// given

		// when

		// then
	}

	@Test
	public void inserirProfessor() {

		// given

		// when

		// then
	}

	@Test
	public void atualizarProfessor() {

		// given

		// when

		// then

	}

	public void deletarProfessor() {

		// given

		// when

		// then

	}

}
