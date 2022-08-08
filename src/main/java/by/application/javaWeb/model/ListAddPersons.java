package by.application.javaWeb.model;


import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListAddPersons", value = "/ListAddPersons")
public class ListAddPersons {
    private static List<Person> groupList = new ArrayList();

    static {
        groupList.add(new Person("222", "erf","+2222", "anna.1.18@gmail.com", "222", "22222", "111"));
    }

    static public List<Person> retrieveList() {
        return groupList;
    }

    static public void addPerson(Person person) {

        groupList.add(new Person(person));
    }
}
