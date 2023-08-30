package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carmodel;

import com.example.demo.service.Carservice;

@RestController
public class Carcontroller
{
	@Autowired
	Carservice cs;
   @PostMapping("/post")
   public boolean add(@RequestBody Carmodel cm)
   {
	   return cs.saveinfo(cm)!=null;
   }
   @GetMapping("/owners/{owners}")
   
   public List<Carmodel> displayowner(@PathVariable int owners)
   {
	   return cs.getde(owners);
	   
   }
  @GetMapping("/address/{address}")
   
  public List<Carmodel> displayAddress(@PathVariable String  address)
  {
	   return cs.getad(address);
	   
  }
  @GetMapping("/carname/{carname}")
  public List<Carmodel> displayname(@PathVariable String  carname)
  {
	   return cs.getna(carname);
	   
  }
  @GetMapping("owners/{owners}/cartype/{cartype}")
 
  public List<Carmodel> displayAll(@PathVariable int owners,@PathVariable String  cartype)
  {
	   return cs.getoa(owners,cartype);
	   
  }
}