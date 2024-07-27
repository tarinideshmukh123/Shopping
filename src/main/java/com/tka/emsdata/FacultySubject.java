package com.tka.emsdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class FacultySubject {
@Id 
@GeneratedValue(strategy=GenerationType.AUTO)

	int subid;
	String subnm;
	
	
	public FacultySubject(String subnm) {
		super();
		this.subnm = subnm;
	}
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacultySubject(int subid, String subnm) {
		super();
		this.subid = subid;
		this.subnm = subnm;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubnm() {
		return subnm;
	}
	public void setSubnm(String subnm) {
		this.subnm = subnm;
	}
	@Override
	public String toString() {
		return "FacultySubject [subid=" + subid + ", subnm=" + subnm + "]";
	}
	
}
