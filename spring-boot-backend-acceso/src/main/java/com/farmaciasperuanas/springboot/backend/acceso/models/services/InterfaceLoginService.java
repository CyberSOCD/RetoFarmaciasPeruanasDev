package com.farmaciasperuanas.springboot.backend.acceso.models.services;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Login;

public interface InterfaceLoginService {
	
	public Login findByUsername(String username);
	
	public Login save(Login login);
	
	public void delete(Long id);

}