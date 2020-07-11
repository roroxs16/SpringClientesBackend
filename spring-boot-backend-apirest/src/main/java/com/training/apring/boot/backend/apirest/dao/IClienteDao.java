package com.training.apring.boot.backend.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.training.apring.boot.backend.apirest.models.Cliente;


public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
