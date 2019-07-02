package com.tyss.Leave.dto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="leaves_info")

public class Leaveinfo implements Serializable
{
	@Id
	@Column(name="Days")
	private int days;
	@Column(name="Leave_type")
	private String leavetype;
	@Column(name="Description")
	private String description;
	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
