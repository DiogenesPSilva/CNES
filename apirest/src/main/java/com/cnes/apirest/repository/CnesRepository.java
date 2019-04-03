package com.cnes.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnes.apirest.models.Cnes;

public interface CnesRepository extends JpaRepository<Cnes, Integer>{
	
	Cnes findById(int id);
	List<Cnes> findByUf(String uf);
	List<Cnes> findByDsTipoUnidade(String dsTipoUnidade);
	
}
