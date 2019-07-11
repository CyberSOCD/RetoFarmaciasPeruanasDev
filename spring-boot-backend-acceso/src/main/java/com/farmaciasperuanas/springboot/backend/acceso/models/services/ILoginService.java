package com.farmaciasperuanas.springboot.backend.acceso.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.farmaciasperuanas.springboot.backend.acceso.models.dao.ILoginDao;
import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Login;

@Service
public class ILoginService implements InterfaceLoginService, UserDetailsService{
	
	private Logger logger = LoggerFactory.getLogger(ILoginService.class);

	@Autowired
	private ILoginDao loginDao;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Login login = loginDao.findByUsername(username);
		
		if(login == null) {
			logger.error("Error en el login: no existe el usuario '"+username+"' en el sistema!" );
			throw new UsernameNotFoundException("Error en el login: no existe el usuario '\"+username+\"' en el sistema!");
		}
		
		List<GrantedAuthority> authorities = login.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNom_rol()))
				.peek(authority -> logger.info("Role:" +authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(login.getUsername(), login.getPassword(), login.getEnabled(), true, true, true, authorities);
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public Login findByUsername(String username) {		
		return loginDao.findByUsername(username);
	}


	@Override
	@Transactional
	public Login save(Login login) {
		return loginDao.save(login);
	}


	@Override
	public void delete(Long id) {
		loginDao.deleteById(id);
	}

}