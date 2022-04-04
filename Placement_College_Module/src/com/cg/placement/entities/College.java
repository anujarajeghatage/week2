package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//INSERT TABLE NAME THAT IS CREATED IN MYSQL(E.G_COLLEGE)
@Table(name="college")   
public class College 
{
	
@Id
private int id;
private String collegeAdmin;
private String collegeName;
private String location;

//CREATE GETTERS AND SETTERS FOR ALL ATTRIBUTES
public int getId() {                             
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollegeAdmin() {
	return collegeAdmin;
}
public void setCollegeAdmin(String collegeAdmin) {
	this.collegeAdmin = collegeAdmin;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}


}