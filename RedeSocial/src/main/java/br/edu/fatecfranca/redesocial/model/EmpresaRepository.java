package br.edu.fatecfranca.redesocial.model;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.redesocial.model.entity.Empresa;

public interface EmpresaRepository extends 
	JpaRepository<Empresa, Long>{
	
	// esta interface terá os métodos prontos
	// para inserção (save), remoção (remove), atualização
	// (save) e consulta(find)

}
