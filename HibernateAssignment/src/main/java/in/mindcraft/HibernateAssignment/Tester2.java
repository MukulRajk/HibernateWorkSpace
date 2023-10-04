package in.mindcraft.HibernateAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester2 {

	public static void main(String args[]) {
		Address a1=new Address();
        a1.setPincode(400088);
        a1.setName("Andheri");
        
        Address a2=new Address();
        a2.setPincode(400043);
        a2.setName("Kurla");
		
		Employee e1=new Employee();
		e1.setEmpid(101);
        e1.setName("Kumar");
        
        //one - one relation
        e1.getList().add(a1);
        e1.getList().add(a2);
        

Configuration con=new Configuration().configure();

ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();		
	
SessionFactory sf=con.buildSessionFactory(reg);

Session session=sf.openSession();

Transaction tx=session.beginTransaction();

session.save(a1);
session.save(a2);
session.save(e1);//save


tx.commit();
	
	}
	
}
