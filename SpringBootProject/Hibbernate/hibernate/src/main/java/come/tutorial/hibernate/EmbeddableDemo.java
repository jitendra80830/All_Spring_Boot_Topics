package come.tutorial.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Student student = new Student();
		student.setId(203);
		student.setName("2amna");
		student.setCity("N2oida");

		Certificate certificate = new Certificate();
		certificate.setDuration("3  Months");
		certificate.setCource("Java1");
		student.setCertificate(certificate);
		Transaction transaction = session.beginTransaction();

		session.save(student);

		transaction.commit();
		session.close();

		factory.close();
	}

}
