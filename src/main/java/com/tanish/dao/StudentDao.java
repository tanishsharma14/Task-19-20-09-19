package com.tanish.dao;

import java.util.List;

import com.tanish.entities.Branch;
import com.tanish.entities.Student;

public interface StudentDao {

	public void addBranch(Branch branch);
	public List<Branch> getBranchList();
	public void saveStudent(Student student);
}
