package br.edu.fatecfranca.redesocial.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {
	
	@Id // primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	private String nome; 
	@Column(name="cpf")
	private String cpf;
	@Column(name="url")
	private String url;
	@Column(name="faturamento")
	private float faturamento;
	@Column(name="nroFuncionarios")
	private int nroFuncionarios;
	
	public Empresa() {
		
	}

	public Empresa(Long id, String nome, String cpf, String url, float faturamento, int nroFuncionarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.url = url;
		this.faturamento = faturamento;
		this.nroFuncionarios = nroFuncionarios;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}

	public int getNroFuncionarios() {
		return nroFuncionarios;
	}

	public void setNroFuncionarios(int nroFuncionarios) {
		this.nroFuncionarios = nroFuncionarios;
	}
	
	
}
