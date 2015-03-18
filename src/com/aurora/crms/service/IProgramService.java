package com.aurora.crms.service;

import com.aurora.crms.domain.Program;

public interface IProgramService {
	public void saveProgram(Program program);
	public void get(int id);
	public void getAll();
}
