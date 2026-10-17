package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.LanguageTutor;
import com.klef.soa.exam.service.LanguageTutorService;

@RestController
@RequestMapping("/tutor")
public class LanguageTutorController 
{
	@Autowired
	private LanguageTutorService service;
	
	@GetMapping("/")
	public String tutor()
	{
		return "Language tutor Service is Running";
	}
	
	@PostMapping("/add")
	public LanguageTutor add(@RequestBody LanguageTutor tutor)
	{
		return service.add(tutor);
	}
	
	@GetMapping("/displayall")
	public List<LanguageTutor> displayall()
	{
		return service.displayAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteByid(@PathVariable Long id)
	{
		service.deleteByid(id);
		return "Deleted Successfully";
	}
	
}
