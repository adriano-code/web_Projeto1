package com.uepb.web.projetoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uepb.web.projetoWeb.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
