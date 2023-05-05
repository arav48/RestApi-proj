package com.example.clownstars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clownstars.model.login;
import com.example.clownstars.repo.loginrepo;


@Service
public class loginservice {
	@Autowired
	loginrepo ls; 
	public String loginCheckData(String username,String password)
	{
		login user = ls.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
		
	}

}
