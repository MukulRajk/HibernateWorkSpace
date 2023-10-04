package in.mindcraft.HQLDemo;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/* 
 Write a menu driven program to perform CRUD operations on mobile phone objects using HQL
*/
public class Tester {

	public static void main(String[] args) {
		
	/*	MobilePhone m1=new MobilePhone(101,"Mi",25667);
		MobilePhone m2=new MobilePhone(102,"Lava",45367);
		MobilePhone m3=new MobilePhone(103,"Samsung",75667);
		MobilePhone m4=new MobilePhone(104,"Oppo",15667); */
		
		
		// default constructor
		//toString method
		
		Configuration con=new Configuration().configure();
ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();		
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		//MobilePhone m=(MobilePhone)session.get(MobilePhone.class,102);
		//System.out.println("Details of Mobile = " +m);

		Query query=session.createQuery("FROM MobilePhone ");  // from classname instead of tablename
		// also written as "from MobilePhone m where m.cost>22000"
		List<MobilePhone> mlist=query.list();
		

		
		for(MobilePhone m:mlist)
			System.out.println(m);

		/*session.save(m1);
		session.save(m2);
		session.save(m3);//save
		session.save(m4);*/

		tx.commit();

	}

}
