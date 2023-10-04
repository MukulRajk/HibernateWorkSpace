package in.mindcraft.HibernateDemo;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Laptop {
	
	@Id
 private int lid;
 private String make;
 
 @ManyToMany
 private  List<Student> list=new ArrayList<Student>();
 
 
public List<Student> getList() {
	return list;
}
public void setList(List<Student> list) {
	this.list = list;
}



public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
	
}
}