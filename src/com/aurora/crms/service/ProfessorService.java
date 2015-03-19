package com.aurora.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurora.crms.domain.Professor;

@Service
@Transactional
public class ProfessorService implements IProfessor{

	@Override
	public boolean addListOfProfessors(List<Professor> professors) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
