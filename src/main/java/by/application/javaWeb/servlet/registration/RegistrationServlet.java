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
        String password = request.getParameter("password");
        //List<Person> groupList = new ArrayList();
        Person person = new Person(name, surname, email, date, numberPhone, password);

        if (("".equals(name)) || ("".equals(surname)) || ("".equals(date)) || ("".equals(email))
                || ("".equals(numberPhone)) || ("".equals(password))) {
            request.setAttribute("errorMessage", "You should fill all field!");
            request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
        } else {
            //добавление пользователя
            //--HIBERNATE ADD PERSON--
            personService.addPerson(person);
            System.out.println("---Person is add---");
            //------------------------
            request.getSession().setAttribute("name",  name);
            request.getSession().setAttribute("surname", surname);
            //List<Person> personList = personService.showPeople();
            request.setAttribute("group", personService);
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        }

       //request.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(request, response);
        //response.sendRedirect(request.getContextPath() + "/PersonsList");

    }
}
