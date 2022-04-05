package com.uepb.web.projetoWeb.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.uepb.web.projetoWeb.repository.ProjetoRepository;
import com.uepb.web.projetoWeb.service.ProjetoService;


public class ProjetoServiceTest {
	
	@Mock
	private ProjetoRepository projetoRepository;
	
	@InjectMocks
	private ProjetoService projetoService;
	
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
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
