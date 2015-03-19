package com.aurora.crms.service;

import java.util.List;

import com.aurora.crms.domain.Professor;

public interface IProfessor {
	public boolean addListOfProfessors(List <Professor> professors);
	public boolean addProfessor(Professor professor);
	public boolean removeProfessor(Professor professor);


}
