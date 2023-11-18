package br.edu.fatecfranca.redesocial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecfranca.redesocial.model.EmpresaRepository;
import br.edu.fatecfranca.redesocial.model.dto.EmpresaDto;
import br.edu.fatecfranca.redesocial.model.entity.Empresa;

@Service
public class EmpresaService {
	
	@Autowired
	EmpresaRepository injecao;
	
	
	
	public void deleteEmpresa(Long id) {
		if (injecao.existsById(id)) {
			injecao.deleteById(id);
		}
	}
	
	public EmpresaDto addEmpresa(EmpresaDto empresaDto) {
		Empresa empresa = converteToEmpresa(empresaDto);
		Empresa novaEmpresa = injecao.save(empresa);
		return converteToEmpresaDto(novaEmpresa);
	}
	
	public EmpresaDto atualizaEmpresa(EmpresaDto empresaDto) {
		Empresa empresa = converteToEmpresa(empresaDto);
		Empresa novaEmpresa = injecao.save(empresa);
		return converteToEmpresaDto(novaEmpresa);
	}
	
	public List<EmpresaDto> getEmpresas(){
		List<Empresa> empresas = injecao.findAll();
		return converteToListaDto(empresas);
	}
	
	
	// converte Lista de Empresa em Lista da Empresa Dto
	public List<EmpresaDto> converteToListaDto(List<Empresa> empresas){
		
		List<EmpresaDto> listaDto = new ArrayList<EmpresaDto>();
		
		for(int i=0;i<empresas.size();i++) {
			listaDto.add(converteToEmpresaDto(empresas.get(i)));
		}
		return listaDto;
	}
	
	
	// converte EmpreDto para Empresa
	public Empresa converteToEmpresa(EmpresaDto empresaDto) {
		Empresa empresa = new Empresa();
		empresa.setCpf(empresaDto.getCpf());
		empresa.setFaturamento(empresaDto.getFaturamento());
		empresa.setId(empresaDto.getId());
		empresa.setNome(empresaDto.getNome());
		empresa.setNroFuncionarios(empresaDto.getNroFuncionarios());
		empresa.setUrl(empresaDto.getUrl());
		
		return empresa;
	}
	// converte Empresa para EmpresaDto
	public EmpresaDto converteToEmpresaDto(Empresa empresa) {
		EmpresaDto empresaDto = new EmpresaDto(empresa);
		return empresaDto;
	}
}
