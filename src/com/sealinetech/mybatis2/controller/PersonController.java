package com.sealinetech.mybatis2.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sealinetech.mybatis2.pojo.Person;
import com.sealinetech.mybatis2.service.PersonService;

@Controller
@RequestMapping("/login")
public class PersonController
{
	@Resource
	private PersonService personService;

	@Autowired
	private  HttpServletRequest request;

	@RequestMapping(params="method=getPerson")
	public String login(Person person)
	{
		//Person p1 = personService.getPerson(1);
		//System.out.println(p1.getName());
		//personService.insertPerson(person);
		
		List<Map<String, Object>> persons = personService.getPersonList();
		request.setAttribute("persons", persons);
		return "welcome";
	}
}
