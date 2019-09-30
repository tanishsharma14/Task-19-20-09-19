package com.tanish.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Student {

	@Id
	@NotNull(message="Please enter id")
	private int id;
	
	@Pattern(regexp="[a-zA-Z]+", message="Only alphabets are allowed")
	@Size(min=2,max=20)
	@NotEmpty(message="Please enter name")
	private String name;
	private String branch;
	@Email(message="Please enter correct email")
	private String email;
	private String mobile;
	public Student(int id, String name, String branch, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.mobile = mobile;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	
	
}
