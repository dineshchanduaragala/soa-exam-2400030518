package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.LanguageTutor;

public interface LanguageTutorService 
{
	LanguageTutor add(LanguageTutor tutor);
	List<LanguageTutor> displayAll();
	String deleteByid(Long id);
}
