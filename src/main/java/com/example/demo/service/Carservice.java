package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Carmodel;
import com.example.demo.repository.Carrepo;

@Service
public class Carservice {
@Autowired
Carrepo cr;
public Carmodel saveinfo(Carmodel bm)
{
	return cr.save(bm);
}
public List<Carmodel>getoa(int s,String b)
{
	return cr.getdd(s,b);
}

public List<Carmodel> getad(String b)
{
	return cr.getaddress(b);
}
public List<Carmodel> getna(String b)
{
	return cr.getname(b);
}
public List<Carmodel> getde(int b)
{
	return cr.getdetails(b);
}

}