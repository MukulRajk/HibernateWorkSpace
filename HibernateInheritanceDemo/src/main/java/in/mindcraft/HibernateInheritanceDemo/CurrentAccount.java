package in.mindcraft.HibernateInheritanceDemo;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Account{
 private double overLimit;

public double getOverLimit() {
	return overLimit;
}

public void setOverLimit(double overLimit) {
	this.overLimit = overLimit;
}
	
}
