package com.cognizant.payroll1.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.payroll1.Payroll1Application;
import com.cognizant.payroll1.model.Department;
import com.cognizant.payroll1.model.Skill;
import com.cognizant.payroll1.repository.SkillRepository;

@Service
public class SkillService {
	@Autowired
	private SkillRepository skillRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Payroll1Application.class);
	
	@Transactional
	public Skill get(int id) {

		  LOGGER.info("Start");
		  return skillRepository.findById(id).get();
	  }
	  
	  @Transactional
	  public void save(Skill skill) {
		  LOGGER.info("Start");
		  skillRepository.save(skill);
		  LOGGER.info("End");

	  }
}

