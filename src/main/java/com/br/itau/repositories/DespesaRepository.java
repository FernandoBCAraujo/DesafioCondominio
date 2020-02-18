package com.br.itau.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.itau.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Integer>{

}
