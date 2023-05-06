package in.com.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.com.model.Student;
import in.com.util.HibernateUtil;

public class SaveApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				transaction = session.beginTransaction();
			}

			if (transaction != null) {
				Student student = new Student();

				student.setSid(21);
				student.setSname("Monu");
				student.setSage(21);
				student.setSaddress("Saroop Nagar");

				session.save(student);
				flag = true;

			}

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(flag) {
				transaction.commit();
				System.out.println("Object saved to database......");
			}
			else {
				transaction.rollback();
				System.out.println("Object not saved to database......");
			}
		}
		
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();

	}

}
