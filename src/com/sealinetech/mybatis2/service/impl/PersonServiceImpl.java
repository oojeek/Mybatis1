package com.sealinetech.mybatis2.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sealinetech.mybatis2.dao.PersonDao;
import com.sealinetech.mybatis2.pojo.Person;
import com.sealinetech.mybatis2.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService
{
	@Resource
	private PersonDao personDao;
	
	@Override
	public Person getPerson(int id)
	{
		// TODO Auto-generated method stub
		return personDao.getPerson(id);
	}

	@Override
	public void insertPerson(Person person)
	{
		// TODO Auto-generated method stub
		personDao.insertPerson(person);
	}

	@Override
	public List<Map<String, Object>> getPersonList()
	{
		// TODO Auto-generated method stub
		return personDao.getPersonList();
	}

}
