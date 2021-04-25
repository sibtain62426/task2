package Servlet_pakage;

import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_file")
public class Servlet_file extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String Email = request.getParameter("Email");
        String Date of birth = request.getParameter("Date of birth");
        String Gender = request.getParameter("Gender");

        PrintWriter out = response.getWriter();
		out.println(Name);
        out.println(Username);
        out.println(Password);
        out.println(Email);
        out.println(Date of birth);
        out.println(Gender);

        DbConnection dbConnection = new DbConnection();
        dbConnection.insertRecord(Name,Username,Password,Email,Date of birth,Gender);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
