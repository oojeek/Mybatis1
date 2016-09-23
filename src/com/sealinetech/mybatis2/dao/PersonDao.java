package com.sealinetech.mybatis2.dao;

import java.util.List;
import java.util.Map;

import com.sealinetech.mybatis2.pojo.Person;

public interface PersonDao
{
	Person getPerson(int id);
	void insertPerson(Person person);
	List<Map<String, Object>> getPersonList();
}
