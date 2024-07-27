package com.tka.emsdata;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="aid")
	
int cid;
String cnm;
Accident a;

public Car(String cnm) {
	super();
	this.cnm = cnm;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(String cnm, Accident a) {
	super();
	this.cnm = cnm;
	this.a = a;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCnm() {
	return cnm;
}
public void setCnm(String cnm) {
	this.cnm = cnm;
}
public Accident getA() {
	return a;
}
public void setA(Accident a) {
	this.a = a;
}
@Override
public String toString() {
	return "Car [cid=" + cid + ", cnm=" + cnm + ", a=" + a + "]";
}


}
