package com.sealinetech.mybatis2.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sealinetech.mybatis2.dao.PersonDao;
import com.sealinetech.mybatis2.pojo.Person;
import com.sealinetech.mybatis2.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService
{
	@Resource
	private PersonDao personDao;
	
	public PersonDao getPersonDao()
	{
		return personDao;
	}

	public void setPersonDao(PersonDao personDao)
	{
		this.personDao = personDao;
	}

	@Override
	public Person getPerson(int id)
	{
		// TODO Auto-generated method stub
		return personDao.getPerson(id);
	}

}
