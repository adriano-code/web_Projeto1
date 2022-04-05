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
import com.uepb.web.projetoWeb.controller.AlunoController;
import com.uepb.web.projetoWeb.service.AlunoService;

//@ExtendWith(MockitoException.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AlunoControllerTest {

	private static final String ALUNO_API_URL_PATH = "/api/v1/alunos";
	private static final long VALID_ALUNO_ID = 1L;
	private static final long INVALID_ALUNO_ID = 2L;
	
	private MockMvc mvc;
	
	@Mock
	private AlunoService alunoService;
	
	@InjectMocks
	private AlunoController alunoController;
	
	private ObjectMapper objctMapper = new ObjectMapper();	
	
	
	@BeforeEach
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(alunoController).build();
	}
	
	@Test
	public void buscarAlunoPorId() {

		// given

		// when

		// then

	}

	@Test
	public void buscarAlunos() {

		// given

		// when

		// then
	}

	@Test
	public void inserirAluno() {

		// given

		// when

		// then
	}

	@Test
	public void atualizarAluno() {

		// given

		// when

		// then

	}

	public void deletarAluno() {

		// given

		// when

		// then

	}
	
}
