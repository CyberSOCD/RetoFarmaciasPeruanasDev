package com.farmaciasperuanas.springboot.backend.acceso.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Login;
import com.farmaciasperuanas.springboot.backend.acceso.models.services.ILoginService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {
	
	@Autowired
	private ILoginService loginService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Login login = loginService.findByUsername(authentication.getName());
		
		Map<String, Object> info = new HashMap<>();
		info.put("info_adicional","Hola que tal!".concat(authentication.getName()));
		
		info.put("nombre_usuario",login.getId() + ": " + login.getUsername());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
