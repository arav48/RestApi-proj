package com.example.clownstars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.clownstars.model.Clownmodel;
import com.example.clownstars.repo.Clownrep;

import jakarta.transaction.Transactional;


@Service
public class Clownservice 
{
	@Autowired
	Clownrep repository;
	
	public List<Clownmodel> getClowns()
	{
		return repository.findAll();
	}
	public Optional<Clownmodel> getClownbyId(int id) 
	{
		return repository.findById(id);
	}
	public Clownmodel addClown(Clownmodel clown)
	{
		return repository.save(clown);
	}
	public Clownmodel editClown(Clownmodel clown, int id) 
	{
		Clownmodel clownx = repository.findById(id).orElse(null);
		if(clownx !=null)
		{
			clownx.setCname(clown.getCname());
			clownx.setAge(clown.getAge());
			clownx.setColor(clown.getColor());
			return repository.saveAndFlush(clownx);
		}
		else 
		{
			return null;
		}

	}
	public String deleteClown(int id)
	{
		repository.deleteById(id);
		return id + " deleted !";
	}
	public List<Clownmodel>sortDonors(String field)
	{
		 return repository.findAll(Sort.by(field));
	}
	public List<Clownmodel>pagingClowns(int offset,int pageSize)
	  {
		  Pageable paging=PageRequest.of(offset, pageSize);
		  Page<Clownmodel> repositoryData=repository.findAll(paging);
		  List<Clownmodel>repositoryList=repositoryData.getContent();
		  return repositoryList;
	  }
	  public List<Clownmodel>pagingAndSortingClowns(int offset,int pageSize,String field)
	  {
		  Pageable paging=PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		  Page<Clownmodel> repositor=repository.findAll(paging);
		  return repositor.getContent();
	  }
	  @Transactional
	  public int deleteClownmodelByName(String cname)
	  {
	  	return repository.deleteStudentByName(cname);
	  } 
	  public List<Clownmodel> fetchAll()
	  {
	 	 return repository.findAll();
	  }
	  public Clownmodel saveAll(Clownmodel s)
	  {
	 	 return repository.save(s);
	  }
	  public List<Clownmodel> fetchid(int id)
	  {
	 	   return repository.getClownmodelByid(id);
	  }
	  public Clownmodel fetchbyname(String cname)
	  {
	 	   return repository.findClownmodelByName(cname);
	  }

	 }


	
