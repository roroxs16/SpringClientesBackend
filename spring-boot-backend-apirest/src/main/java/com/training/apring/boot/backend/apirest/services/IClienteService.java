package com.training.apring.boot.backend.apirest.services;

import java.util.List;

import com.training.apring.boot.backend.apirest.models.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente finById(Long id);
}
