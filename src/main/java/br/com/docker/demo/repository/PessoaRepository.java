package br.com.docker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.docker.demo.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
