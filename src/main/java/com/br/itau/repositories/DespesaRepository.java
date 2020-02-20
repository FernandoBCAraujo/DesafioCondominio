package com.br.itau.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.itau.models.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

//	@Query("SELECT d FROM Despesa d JOIN Proprietario p WHERE d.idProprietario = p.idProprietario")
//	Optional<Despesa> findAllDespesas(Despesa despesa); 
//	@Query("SELECT d.id_despesa, d.nome_despesa, p.id_proprietario FROM Despesa d JOIN Proprietario p "
//			+ "WHERE d.id_Proprietario = p.id_Proprietario")
//	Optional<Despesa> findAllDespesas(Despesa despesa);

//SELECT d.id_despesa, d.nome_despesa, p.id_proprietario, p.nome_proprietario FROM Despesa d JOIN Proprietario p WHERE d.id_Proprietario = p.id_Proprietario

}
