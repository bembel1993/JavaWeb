package by.application.javaWeb.dao;

import by.application.javaWeb.model.Person;

import java.util.List;

public interface PersonDao {
    boolean addPerson(Person person);
    List<Person> showPeople();
    Person findPersonByName(String name);
}
