package com.yisusdracon.backend.api.models.services;

import java.util.List;

import com.yisusdracon.backend.api.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	
	public Cliente findbyId(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
