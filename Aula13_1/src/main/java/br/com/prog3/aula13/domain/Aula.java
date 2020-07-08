package br.com.prog3.aula13.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Integer tempoDuracao;
		@ManyToOne
	@JoinColumn(name = "id_curso", nullable = true, updatable = true)
	private Curso curso;
	public Aula() {
	}
	//get/set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(Integer tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	}


