package com.opentext.EmpInfo.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name="emp_info")
public class EmployeeInfo implements Serializable 
{
	@Id
	@Column(name="Id")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="DOB")
	private String dob;
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	@Column(name="Age")
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="Gender")
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name="EmailId")
	private String emailid;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Column(name="Designation")
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name="PhoneNo")
	private long phoneno;

	public long getPhoneNo() {
		return phoneno;
	}

	public void setPhoneNo(long phoneno) {
		this.phoneno = phoneno;
	}
	@Column(name="Salary")
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Column(name="mgrid")
	private int mgrid;

	public int getMgrid() {
		return mgrid;
	}

	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	@Column(name="Dept_Id")
	private int deptid;

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	
	
}
