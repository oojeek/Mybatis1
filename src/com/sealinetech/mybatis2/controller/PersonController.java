package com.sealinetech.mybatis2.controller;

import javax.annotation.Resource;

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

	@RequestMapping(params="method=getPerson")
	public String login(Person person)
	{
		Person p1 = personService.getPerson(1);
		System.out.println(p1.getName());
		return "index";
	}
}
