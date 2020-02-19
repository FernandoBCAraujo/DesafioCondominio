package com.br.itau.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.itau.models.Apartamento;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer>{

}
