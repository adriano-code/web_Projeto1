package com.uepb.web.projetoWeb.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uepb.web.projetoWeb.repository.ProfessorRepository;
import com.uepb.web.projetoWeb.service.ProfessorService;


public class ProfessorServiceTest {
	
	@Mock
	private ProfessorRepository professorRepository;
	
	@InjectMocks
	private ProfessorService professorService;
	
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
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
