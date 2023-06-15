package Controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Usuario;

@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 		
			throws ServletException, IOException {
				Usuario user = new Usuario();		
				String n1 = request.getParameter("numero1");
				String n2 = request.getParameter("numero2");
				int numero1 = Integer.parseInt(n1);
				int numero2 = Integer.parseInt(n2);
				user.setnumero1(numero1);
				user.setnumero2(numero2);
				
				if(autenticar(user)){
					user.dividir();
					request.getSession().setAttribute("user", user);
					response.sendRedirect("home.jsp");
				}else{
					request.setAttribute("erro", "Divisor nao pode ser 0!");
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
					dispatcher.forward(request, response);
				}
			}
	private boolean autenticar(Usuario user) {
		boolean autenticado = false;
		
		if(user.getnumero2() != 0){
			autenticado = true;
		}
		return autenticado;
	}


}
