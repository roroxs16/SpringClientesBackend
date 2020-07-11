package com.training.apring.boot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.apring.boot.backend.apirest.dao.IClienteDao;
import com.training.apring.boot.backend.apirest.models.Cliente;

@Service
public class ClienteServicesImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Override

	public List<Cliente> findAll() {

		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return clienteDao.findAll(pageable);
	}
	
	@Override
	public Cliente save(Cliente cliente) {

		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {

		clienteDao.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente finById(Long id) {

		return clienteDao.findById(id).orElse(null);
	}



}
