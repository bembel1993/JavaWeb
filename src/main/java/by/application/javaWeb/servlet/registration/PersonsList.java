package by.application.javaWeb.servlet.registration;


import by.application.javaWeb.model.ListAddPersons;
import by.application.javaWeb.model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PersonsList", value = "/PersonsList")
public class PersonsList extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ListAddPersons listAddPersons = new ListAddPersons();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request (контекст запроса): данные сохраняются в HttpServletRequest
        request.setAttribute("group", ListAddPersons.retrieveList());

        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

    }
}
