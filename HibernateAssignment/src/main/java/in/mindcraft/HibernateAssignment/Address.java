package in.mindcraft.HibernateAssignment;



	

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity

	public class Address {
		
		@Id
	 private int pincode;
	 private String name;
	 
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
	/*public int getLid() {
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
	}*/
		
	}

	

