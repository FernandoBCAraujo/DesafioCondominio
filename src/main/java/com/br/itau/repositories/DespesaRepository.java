package com.br.itau.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.itau.models.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {
	
	@Query("SELECT d FROM Despesa d WHERE d.proprietario.idProprietario = ?1")
	List<Despesa> findAllDespesasByIdProprietario(Integer idProprietario); 

}