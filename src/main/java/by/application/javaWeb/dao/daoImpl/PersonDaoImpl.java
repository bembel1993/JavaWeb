package by.application.javaWeb.dao.daoImpl;

import by.application.javaWeb.dao.PersonDao;
import by.application.javaWeb.model.Person;
import by.application.javaWeb.sessionFactory.SessionFactoryImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public boolean addPerson(Person person) {
        boolean isAdded = false;
        try {
            Session session = SessionFactoryImpl.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(person);
            tx.commit();
            session.close();
            isAdded = true;
        } catch (NoClassDefFoundError e) {
            System.out.println("Exception: " + e);
        }
        return isAdded;
    }

    @Override
    public List<Person> showPeople() {
        List<Person> people = (List<Person>)SessionFactoryImpl.getSessionFactory().openSession().createQuery("FROM Person").list();
        return people;
    }
}
