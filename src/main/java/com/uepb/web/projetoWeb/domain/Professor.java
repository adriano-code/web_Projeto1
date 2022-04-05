package com.uepb.web.projetoWeb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Professor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String formacao;

	@Column(nullable = false, unique = true)
	private String matricula;

	@Column(nullable = false, unique = true)
	private String email;

	@OneToOne
	private Turma turma;
}
