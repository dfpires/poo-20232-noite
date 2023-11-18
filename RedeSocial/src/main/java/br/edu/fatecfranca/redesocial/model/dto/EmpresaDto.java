package br.edu.fatecfranca.redesocial.model.dto;

import br.edu.fatecfranca.redesocial.model.entity.Empresa;

public class EmpresaDto {
	private Long id;
	private String nome; 
	private String cpf;
	private String url;
	private float faturamento;
	private int nroFuncionarios;
	
	public EmpresaDto() {
		
	}
	public EmpresaDto(Empresa empresa) {
		this.id = empresa.getId();
		this.cpf = empresa.getCpf();
		this.faturamento = empresa.getFaturamento();
		this.nome = empresa.getNome();
		this.nroFuncionarios = empresa.getNroFuncionarios();
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
