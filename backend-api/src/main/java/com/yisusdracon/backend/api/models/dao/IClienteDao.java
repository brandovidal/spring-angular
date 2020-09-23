package com.yisusdracon.backend.api.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.yisusdracon.backend.api.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
