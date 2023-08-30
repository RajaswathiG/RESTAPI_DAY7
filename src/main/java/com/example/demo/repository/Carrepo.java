package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Carmodel;


public interface Carrepo extends JpaRepository<Carmodel,Integer> {

	 @Query(value="select * from querytable  where owners =:s or cartype =:sn", nativeQuery= true)
	 public List<Carmodel> getdd(@Param("s")int owners, @Param("sn") String cartype);
	 
	 @Query(value="select * from querytable where carname =:sn", nativeQuery= true)
	 public List<Carmodel> getname(@Param("sn") String carname);
	 

	 @Query(value="select * from querytable where address =:sn", nativeQuery= true)
	 public List<Carmodel> getaddress(@Param("sn") String address);
	 

	 @Query(value="select * from querytable where owners=:s", nativeQuery= true)
	 public List<Carmodel> getdetails(@Param("s") int owners); 
	 
	 
}