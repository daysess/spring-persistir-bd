package br.com.daysesoares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daysesoares.entity.Contato;
import br.com.daysesoares.entity.Pessoa;
import br.com.daysesoares.repository.ContatoRepository;
import br.com.daysesoares.repository.PessoaRepository;


@RestController
@RequestMapping("home")
public class TesteController {


	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ContatoRepository contatoRepository;

	@PostMapping
	public String salvarDados() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("Dayse");
		
		Contato contato = new Contato();
		contato.setPessoa(pessoa);
		contato.setTipoContato("Telefone");
		contato.setDescricaoContato("99999-8888");
		
		pessoa.getContatos().add(contato);
		
		contato = new Contato();
		contato.setPessoa(pessoa);
		contato.setTipoContato("email");
		contato.setDescricaoContato("dayse@mail.com");
		
		pessoa.getContatos().add(contato);
		
		pessoaRepository.save(pessoa);
		//contatoRepository.save(contato);
		return "OK";
	}
	
	
}
