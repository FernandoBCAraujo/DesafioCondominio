package com.br.itau.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.itau.models.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer>{
	
	Optional<Proprietario> findByNomeProprietario(String nomeProprietario); 

}
