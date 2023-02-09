package br.com.daysesoares.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Pessoa {

	@Id
	private Integer id;
	
	private String nome;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private List<Contato> contatos = new ArrayList<>();
	
	
}
