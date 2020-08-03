package com.training.apring.boot.backend.apirest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.apring.boot.backend.apirest.models.Cliente;
import com.training.apring.boot.backend.apirest.models.Region;


public interface IClienteDao extends JpaRepository<Cliente, Long> {

	@Query("from Region")
	public List<Region> findAllRegiones();
}
