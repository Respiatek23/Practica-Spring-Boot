/*package edu.comillas.icai.pat.ejemplopat.controler;

import edu.comillas.icai.pat.ejemplopat.DAO.User;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static java.lang.System.out;

@WebServlet("/RecuperacionUsuario")
public class FormController extends HttpServlet{
    /**
     * @see HttpServlet#HttpServlet()

    @Autowired
    MyService myService;
    public FormController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre=request.getParameter("name");
        out.println(nombre);
        String Apellido=request.getParameter("surname");
        String correo=request.getParameter("email");
        Integer d=myService.Count()+1;
        User u=new User(d,nombre,Apellido,correo);
        myService.SetUSER(u);
    }
}
*/