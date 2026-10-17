package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.LanguageTutor;
import com.klef.soa.exam.repository.LanguageTutorRepository;

@Service
public class LanguageTutorServiceImpl implements LanguageTutorService
{
	@Autowired
	private LanguageTutorRepository repository;
	
	@Override
	public LanguageTutor add(LanguageTutor tutor) {
		return repository.save(tutor);
	}

	@Override
	public List<LanguageTutor> displayAll() {
		return repository.findAll();
	}

	@Override
	public String deleteByid(Long id) {
		repository.deleteById(id);
		return "Deleted Successfully";
	}

}
