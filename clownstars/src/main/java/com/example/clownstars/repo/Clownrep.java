package com.example.clownstars.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.clownstars.model.Clownmodel;



public interface Clownrep extends JpaRepository<Clownmodel, Integer> {
	@Modifying
	@Query("delete  from Clownmodel s where s.cname=?1" )
	public int deleteStudentByName(String name);
	
	@Query("select s from Clownmodel s where s.id=:id")
	public List<Clownmodel> getClownmodelByid(int id);
	



}
