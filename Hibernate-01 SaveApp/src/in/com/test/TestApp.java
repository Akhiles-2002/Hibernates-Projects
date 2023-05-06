package in.com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.com.model.Student;

public class TestApp {

	public static void main(String[] args) {

		// 1. Inform JVM to activate HIBERNATE
		Configuration configuration = new Configuration();
		configuration.configure(); // it is optional when file name is hibernate.cfg.xml
									// ->configuration.configure("hibernate.cfg.xml");

		//Creating a SessionFactory object to hold many other objects required for HIBERNATE
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//Using SessionFactory Object, get only one  Session object to perform our persistence operation
		Session openSession = sessionFactory.openSession(); //connection object, ORM dialects, l1 cache, TXT Management

		//Begin the transaction as the operation is non-select
		Transaction transaction = openSession.beginTransaction();
		
		// 2. create PERSISTENCE Object
		Student student = new Student();
		student.setSid(101);
		student.setSname("Rahul");
		student.setSage(20);
		student.setSaddress("New Delhi");

		// 3. Perform PERSISTENCE operation using Entity/Model/POJO Object.
		openSession.save(student);
		
		// 4. Generate the query and send to database for execution
		transaction.commit();
		
		System.out.println("Object saved to the database...");
		
		//closing the resources
		openSession.close();
		sessionFactory.close();
		
	}

}
