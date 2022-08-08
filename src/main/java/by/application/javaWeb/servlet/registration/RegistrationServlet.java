package by.application.javaWeb.servlet.registration;


import by.application.javaWeb.model.ListAddPersons;
import by.application.javaWeb.model.Person;
import by.application.javaWeb.service.PersonService;
import by.application.javaWeb.service.serviceImpl.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    PersonService personService = new PersonServiceImpl();
    private ListAddPersons listAddPersons = new ListAddPersons();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // List<Person> person = personService.showPeople();
        // request.setAttribute("person", person);
        //  request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
        getServletContext().getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.getSession().setAttribute("name", name);
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String date = request.getParameter("date");
        String email = request.getParameter("email");
        String numberPhone = request.getParameter("number");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        List<Person> personList = personService.showPeople();
        Person person = new Person(name, surname, email, date, numberPhone, login, password);

        if (("".equals(name)) || ("".equals(surname)) || ("".equals(date)) || ("".equals(email))
                || ("".equals(numberPhone)) || ("".equals(login)) || ("".equals(password))) {
            request.setAttribute("errorMessage", "You should fill all field!");
            request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
        } else {
            if (personList.size() != 0) {
                boolean isUnique = true;
                for (Person p : personList) {
                    if (p.getLogin().equals(login)) {
                        System.out.println(person.getLogin());
                        isUnique = false;
                    }
                }
                if (isUnique) {
                    personService.addPerson(person);
                    System.out.println("---Person is add---");
                    request.getSession().setAttribute("name", name);
                    request.getSession().setAttribute("surname", surname);
                    //List<Person> personList = personService.showPeople();
                    request.setAttribute("group", personService);
                    request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
                } else {
                    System.out.println("This login is already taken !");
                    request.setAttribute("errorMessage", "This login is already taken !!");
                    request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
                }
            } else {
                personService.addPerson(person);
                System.out.println("---Person is add---");
                request.getSession().setAttribute("name", name);
                request.getSession().setAttribute("surname", surname);
                //List<Person> personList = personService.showPeople();
                request.setAttribute("group", personService);
                request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
            }
        }
    }
}
