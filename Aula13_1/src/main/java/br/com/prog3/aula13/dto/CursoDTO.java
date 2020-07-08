package br.com.prog3.aula13.dto;

import br.com.prog3.aula13.domain.Curso;

public class CursoDTO {
	
	private Long id;
	private String nome;
	private Integer cargaHoraria;
	private Modalidade modalidade;
	public CursoDTO(Curso curso) {
	this.id = curso.getId();
	this.nome = curso.getNome();
	this.cargaHoraria = curso.getCargaHoraria();
	this.modalidade = curso.getModalidade();
	}
	//get/set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	}


