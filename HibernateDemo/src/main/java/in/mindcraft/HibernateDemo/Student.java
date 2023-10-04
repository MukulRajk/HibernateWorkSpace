package in.mindcraft.HibernateDemo;

import java.util.*;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student { // POJO - Plain Old Java Object   
	@Id     
	private int rollno;
	private String name;
	
	//relation
	@ManyToMany(mappedBy="list")
	private List<Laptop> list=new ArrayList<Laptop>();
	 
	public List<Laptop> getList() {
		return list;
	}
	public void setList(List<Laptop> list) {
		this.list = list;
	}	
	// generate getter setter
					
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
