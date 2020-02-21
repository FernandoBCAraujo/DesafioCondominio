package com.br.itau.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.itau.models.Apartamento;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer>{
	
	@Query("SELECT a FROM Apartamento a WHERE a.proprietario.idProprietario = ?1")
	List<Apartamento> findAllApartamentosByIdProprietario(Integer idProprietario); 

}
