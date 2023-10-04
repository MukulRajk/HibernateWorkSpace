package in.mindcraft.HibernateAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

	@Entity
	public class Employee { // POJO - Plain Old Java Object   
		@Id     //primary key
		private int empid;
		private String name;
		
		
		//relation
		@OneToMany
		private List<Address> list=new ArrayList<Address>();
		
		public List<Address> getList() {
			return list;
		}
		public void setList(List<Address> list) {
			this.list = list;
		}	
		// generate getter setter
						/*	public Laptop getLaptop() {
								return laptop;
							}
							public void setLaptop(Laptop laptop) {
								this.laptop = laptop;
							}
	*/
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}

	

