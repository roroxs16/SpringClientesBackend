package com.training.apring.boot.backend.apirest.dao;

import org.springframework.data.repository.CrudRepository;


import com.training.apring.boot.backend.apirest.models.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
