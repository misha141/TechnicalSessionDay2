package com.cognizant.payroll1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cognizant.payroll1.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>  {

}