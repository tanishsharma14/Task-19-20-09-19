package com.tanish.services;

import java.util.List;

import com.tanish.entities.Branch;
import com.tanish.entities.Student;

public interface StudentService {

	public void addBranch(Branch branch);
	public List<Branch> getAllBranch();
	public void saveStudent(Student student);
}
