package come.tutorial.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLExample {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		// session.beginTransaction();
		String query = "from Student as s where s.name=:x and s.city =:y";

		Query<Student> q = session.createQuery(query);
		q.setParameter("x", "amna");
		q.setParameter("y", "Noida");
		List<Student> list = q.list();
		list.forEach(n -> {
			System.out.println(n.getName() + " " + n.getCity() + " " + n.getId());
		});

		Transaction transaction = session.beginTransaction();

		// Delete Query
		/*
		 * Query query2 =
		 * session.createQuery("delete from Student as s where s.name=:x");
		 * query2.setParameter("x", "amna"); int rowData = query2.executeUpdate();
		 * System.out.println("Deleted:  " + rowData);
		 */

		// Update Query

		/*
		 * Query query3 =
		 * session.createQuery("update Student as s set s.city=:c where s.name =:n");
		 * query3.setParameter("c", "Gaya"); 
		 * query3.setParameter("n", "2amna"); 
		 * int update = query3.executeUpdate(); System.out.println("Updated :" + update);
		 */
		
		
		//How to execute join query
		//"select q.question,q.quetionid,a.answer from Question as q inner join q.answer as a"
		
		

		transaction.commit();

		factory.close();
		session.close();
	}

}
