package in.mindcraft.HQLDemo;

import java.util.List;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@Entity
class Mymobile {
	@Id
	private int id;
	private String name;
	private double cost;
	
	public Mymobile() {
		
	}
	
	public Mymobile(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mymobile [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

	public void show() {
		System.out.println( id+" "+name+" "+cost);
	}
	
}




public class PracticeHQL {
public static void main(String args[]){
	
Scanner sc=new Scanner(System.in);
Configuration con=new Configuration().configure();
ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();		
SessionFactory sf=con.buildSessionFactory(reg);
Session session=sf.openSession();
Transaction tx=session.beginTransaction();

Mymobile my=new  Mymobile();
			
while(true) {
System.out.println("Welcome ");
System.out.println("1.Add data");
System.out.println("2.Show data");
System.out.println("3.update data");
System.out.println("4.delete data");
System.out.println("5.exit ");
int choice=sc.nextInt();

switch(choice) {

case 1:
	System.out.println("1.Add data");
	try {
	System.out.println("enter id,name,cost of mobile");
	Mymobile my1=new Mymobile(sc.nextInt(),sc.next(),sc.nextDouble());
	session.save(my1);
	my1.show();
	break;

	}
	catch(Exception e) {
		System.out.println(e);
	}





case 2:
	System.out.println("2.Show data");
	System.out.println("enter id :");
	int a=sc.nextInt();
	try {
	
Mymobile my2=(Mymobile) session.load(Mymobile.class,a);	
//if(sc.nextInt()==my.getId())	{
my2.show();
tx.commit();


}
	catch(Exception e)
	{
		System.out.println(e);
		}
break;
case 3:
	System.out.println("3.update data");
	try {
System.out.println("enter id : ");
Mymobile my3=(Mymobile) session.get(Mymobile.class,sc.nextInt());  
my3.setName(sc.next());
my3.setCost(sc.nextDouble());
session.update(my3);
tx.commit();
my3.show();
}
	
	catch(Exception e) {
		System.out.println(e);
	}
break;

case 4:
	System.out.println("4.delete data");
	try {
System.out.println("enter id : ");
Mymobile my4=(Mymobile) session.get(Mymobile.class,sc.nextInt());
session.delete(my4);
tx.commit();
break;

	}catch(Exception e) {
		System.out.println(e);
	}
case 5:
	
	//System.exit(0);
	break;
}
}

} 
	
}

