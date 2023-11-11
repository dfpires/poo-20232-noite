package br.edu.fatecfranca.redesocial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.redesocial.model.Empresa;
import br.edu.fatecfranca.redesocial.model.EmpresaRepository;

@RestController
@RequestMapping("/empresa")
public class RedeSocialController {

	// injeção de dependência
	// possibilidade de usar os métodos de um objeto sem
	// instanciá-los
	@Autowired
	EmpresaRepository injecao;
	
	@GetMapping
	public List<Empresa> getEmpresas(){
		
		return injecao.findAll();
		
	}
	
	@PostMapping
	public Empresa addEmpresa(@RequestBody Empresa empresa) {
		return injecao.save(empresa);
	}
}
