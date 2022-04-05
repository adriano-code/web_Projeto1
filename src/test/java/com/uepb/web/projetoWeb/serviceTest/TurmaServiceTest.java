package com.uepb.web.projetoWeb.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uepb.web.projetoWeb.repository.TurmaRepository;
import com.uepb.web.projetoWeb.service.TurmaService;


public class TurmaServiceTest {
	
	@Mock
	private TurmaRepository turmaRepository;
	
	@InjectMocks
	private TurmaService turmaService;
	
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
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
