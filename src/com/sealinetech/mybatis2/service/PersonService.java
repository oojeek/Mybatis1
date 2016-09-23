package com.sealinetech.mybatis2.service;

import java.util.List;
import java.util.Map;

import com.sealinetech.mybatis2.pojo.Person;

public interface PersonService
{
	Person getPerson(int id);
	
	void insertPerson(Person person);
	
	List<Map<String, Object>> getPersonList();
}
