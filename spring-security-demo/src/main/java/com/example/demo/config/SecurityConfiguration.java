package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.service.HomeResourceService;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	private HomeResourceService homeResourceService;
	

	@Autowired
	public SecurityConfiguration(HomeResourceService homeResourceService) {
		
		this.homeResourceService = homeResourceService;
	}


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(homeResourceService);
	}

	
	
}
