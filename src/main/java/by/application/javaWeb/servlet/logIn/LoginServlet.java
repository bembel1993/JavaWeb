package by.application.javaWeb.servlet.logIn;

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
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private ListAddPersons listAddPersons = new ListAddPersons();
    PersonService personService = new PersonServiceImpl();
String gName;
String gPass;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        List<Person> personList = personService.showPeople();
        if (personList.size() != 0) {
            System.out.format("%10s%20s%20s", "ID |", "First Name |", "Password |");
            for (Person p : personList) {
                System.out.println(" ");
                p = personService.findPersonByName(name);
                System.out.format("%10s%20s%20s", p.getId() + " |", p.getFirstName() +
                        " |", p.getPassword() + " |");
                gName = p.getFirstName();
                gPass = p.getPassword();
            }
            System.out.println(gName);
            if(name.equals(gName) && password.equals(gPass)){
                request.getSession().setAttribute("name", name);
                response.sendRedirect(request.getContextPath() + "/WelcomeClassMenu");
            }else{
                System.out.println("Repeat");
                request.getRequestDispatcher("/WEB-INF/views/choice.jsp").forward(request, response);
            }
               /* if ((name.equals(p.getFirstName())) && (password.equals(p.getPassword()))) {
                    request.getSession().setAttribute("name", p.getFirstName());
                    response.sendRedirect(request.getContextPath() + "/WelcomeClassMenu");
                } else if ((name.equals(p.getFirstName())) && (!password.equals(p.getPassword())) ||
                        (!name.equals(p.getFirstName())) && (password.equals(p.getPassword())) ||
                        (!name.equals(p.getFirstName())) && (!password.equals(p.getPassword()))) {
                    request.setAttribute("errorMessage", "Invalid Login or password!!");
                    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
                } else {
                    System.out.println("Users is not!");
                    //request.getRequestDispatcher("/WEB-INF/views/choice.jsp").forward(request, response);
                    request.setAttribute("errorMessage", "Invalid Login or password!!");
                    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
                }*/
        } else {
            System.out.println("Users is not!");
            request.getRequestDispatcher("/WEB-INF/views/choice.jsp").forward(request, response);
        }
        //if (validateUser(name, password)) {
      /*  if (validateUser(name, password)) {
            request.getSession().setAttribute("name", name);
            response.sendRedirect(request.getContextPath() + "/WelcomeClassMenu");
        } else {
            request.setAttribute("errorMessage", "Invalid Login and password!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }*/
    }

    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("Vitali") && password.equals("root");
    }
}
