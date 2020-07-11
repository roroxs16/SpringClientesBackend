package com.training.apring.boot.backend.apirest.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.training.apring.boot.backend.apirest.models.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente finById(Long id);
	
	public Page<Cliente> findAll(Pageable pageable);
}
