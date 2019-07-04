package com.opentext.Studentinfo.dto;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="Student_info")
public class StudentInformation implements Serializable
{
	@Id
	@Column(name="Student_id")
	private int studentid;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	@Column(name="Student_name")
	private String studentname;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@Column(name="Student_email")
	private String studentemail;

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	@Column(name="Student_Phno")
	private long studentphno;

	public long getStudentphno() {
		return studentphno;
	}

	public void setStudentphno(long studentphno) {
		this.studentphno = studentphno;
	}
}
