package br.edu.fatecfranca.redesocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.redesocial.model.entity.Empresa;
import br.edu.fatecfranca.redesocial.service.EmpresaService;
import br.edu.fatecfranca.redesocial.model.EmpresaRepository;
import br.edu.fatecfranca.redesocial.model.dto.EmpresaDto;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	// injeção de dependência
	// possibilidade de usar os métodos de um objeto sem
	// instanciá-los
	
	@Autowired
	EmpresaService injecao;
	
	@GetMapping
	public List<EmpresaDto> getEmpresas(){
		
		return injecao.getEmpresas();
		
	}
	
	@PostMapping
	public EmpresaDto addEmpresa(@RequestBody EmpresaDto empresaDto) {
		return injecao.addEmpresa(empresaDto);
	}
	
	@DeleteMapping("/{id}")
	public void removeEmpresa(@PathVariable("id") Long id) {
		injecao.deleteEmpresa(id);
	}
	
	@PutMapping
	public EmpresaDto updateEmpresa(@RequestBody EmpresaDto empresaDto) {
		// caso o objeto tenha id, ele faz update
		// caso o objeto não tenha id, ele faz insert
		return injecao.atualizaEmpresa(empresaDto);
	}
	
}
