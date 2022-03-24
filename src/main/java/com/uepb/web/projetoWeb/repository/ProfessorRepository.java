package com.uepb.web.projetoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uepb.web.projetoWeb.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
