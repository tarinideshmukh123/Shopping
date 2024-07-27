package com.tka.emsdata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="fid")
	int fid;
	String fnm;
	
	
	public Faculty(String fnm) {
		super();
		this.fnm = fnm;
	}
	public Faculty(String fnm, List<FacultySubject> l) {
		super();
		this.fnm = fnm;
		this.l = l;
	}
	
    List<FacultySubject> l;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int fid, String fnm) {
		super();
		this.fid = fid;
		this.fnm = fnm;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fnm=" + fnm + "]";
	}
//	public void setL(ArrayList<FacultySubject> d) {
		// TODO Auto-generated method stub
	///public void setL(ArrayList<FacultySubject> d) {
		// TODO Auto-generated method stub
	public void setl(ArrayList<FacultySubject> d) {
		// TODO Auto-generated method stub
		
	}
		
	}
		
	
	
	

