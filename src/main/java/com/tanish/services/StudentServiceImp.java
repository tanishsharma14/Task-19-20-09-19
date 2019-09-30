package com.tanish.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanish.dao.StudentDao;
import com.tanish.entities.Branch;
import com.tanish.entities.Student;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentDao studentDao;
	public void addBranch(Branch branch) {
		studentDao.addBranch(branch);
		
	}
	public List<Branch> getAllBranch() {
		List<Branch> list=studentDao.getBranchList();
		return list;
	}
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
		
	}
	

}
