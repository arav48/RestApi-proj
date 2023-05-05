package com.example.clownstars.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.clownstars.service.loginservice;

@RestController
public class logincontroller {
	@Autowired
	loginservice ls;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
			{
				String username = loginDataMap.get("username");
				String password = loginDataMap.get("password");
				String result = ls.loginCheckData(username, password);
				return result;
			}
	}


