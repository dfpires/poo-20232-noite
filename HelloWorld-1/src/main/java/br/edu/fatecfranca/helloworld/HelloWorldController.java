package br.edu.fatecfranca.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // esta classe vai responder pelas requisições rest
@RequestMapping("/hello") // endpoint é /hello
public class HelloWorldController {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/{nome}")
	public String hello(@PathVariable String nome) {
		return "Hello World " + nome;
	}
}
