package com.uepb.web.projetoWeb.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uepb.web.projetoWeb.repository.AlunoRepository;
import com.uepb.web.projetoWeb.service.AlunoService;

public class AlunoServiceTest {
	
	@Mock
	private AlunoRepository alunoRepository;
	
	@InjectMocks
	private AlunoService alunoService;
	
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
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
