package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAOs.AutoDAO;
import model.DTOs.Auto;

@WebServlet("/AutoController")
public class AutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AutoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llego al GET");
		String identificacion = request.getParameter("identificacion");
		AutoDAO autoDao = new AutoDAO();
		Auto auto = autoDao.consultar(identificacion);
		request.setAttribute("autoconsulta", auto);
		javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/RespuestaConsultaAuto.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llego al POST");
		Auto auto = new Auto();
		auto.setIdAuto(request.getParameter("identificacion"));
		auto.setMarca(request.getParameter("marca"));
		auto.setNombre(request.getParameter("nombre"));
		auto.setPlaca(request.getParameter("placa"));
		auto.setIdTipo(request.getParameter("tipo"));
		auto.setIdCiudad("1");
		auto.setValor(request.getParameter("valor"));
		System.out.println("HASTA AQUI BIEN");
		AutoDAO adao = new AutoDAO();
		if(adao.insertar(auto)){
			request.setAttribute("parametroauto", auto.getNombre());
	        request.setAttribute("parametroplaca", auto.getPlaca());
	        javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/AutoNuevo.jsp");
	        rd.forward(request, response);
		}	
	}

}
