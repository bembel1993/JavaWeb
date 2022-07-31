package by.application.javaWeb.service.serviceImpl;

import by.application.javaWeb.dao.PersonDao;
import by.application.javaWeb.dao.daoImpl.PersonDaoImpl;
import by.application.javaWeb.model.Person;
import by.application.javaWeb.service.PersonService;
import org.hibernate.HibernateError;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    PersonDao personDao = new PersonDaoImpl();
    public PersonServiceImpl(){}

    @Override
    public boolean addPerson(Person person) {
        boolean isAdded = false;
        try {
            if (personDao.addPerson(person))
                isAdded = true;
        }
        catch (HibernateError e) {
            // ShowException.showNotice(e);
        }
        return isAdded;
    }

    @Override
    public List<Person> showPeople() {
        List<Person> people = null;
        try {
            people = personDao.showPeople();
        }
        catch (HibernateError e) {
            // ShowException.showNotice(e);
        }
        return people;
    }
}
