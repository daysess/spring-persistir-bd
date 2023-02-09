package br.com.daysesoares.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String tipoContato;
	
	private String descricaoContato;
	
	@ManyToOne()
	@JoinColumn(name = "pessoa")
	private Pessoa pessoa;

	
}
