package come.tutorial.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Pagination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Query query = session.createQuery("from Student");
		query.setFirstResult(0);
		query.setMaxResults(5);
		List<Student> list = query.list();
		for (Student s : list) {
			System.out.println(s.getCity() + " " + s.getName() + " " + s.getId());
		}
	}

}
