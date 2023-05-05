package com.example.clownstars.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clownstars.model.login;
public interface loginrepo extends JpaRepository<login , String> {

	login findByusername(String username);
	      
}

