package br.com.daysesoares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daysesoares.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
