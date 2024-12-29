package come.tutorial.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Projected started");
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       //System.out.println(factory);
       
       Student student = new Student();
       student.setId(101);
       student.setName("jitendra");
       student.setCity("Noida");
       
       Address address = new Address();
       address.setCity("NoidaSe62");
       address.setStreet("City Center");
       address.setOpen(true);
       address.setX(11.0);
       address.setDate(new Date());
       
       FileInputStream fi = new FileInputStream("src/main/java/spring_dispatcherservlet.png");
       
       byte[] data =new byte[fi.available()];
       fi.read(data);
       address.setImage(data);
       
       Session session = factory.openSession();
       Transaction beginTransaction = session.beginTransaction();
       
       session.save(student);
       session.save(address);
       
       beginTransaction.commit();
       
       session.close();
    }
}