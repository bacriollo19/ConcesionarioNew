package org.taller.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.taller.model.DAOs.AutoDAO;
import org.taller.model.DAOs.ClienteDAO;
import org.taller.model.DTOs.Auto;

@WebServlet("/AutoController")
public class AutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final Logger logger = Logger.getLogger(AutoController.class);
	private static final String CRITUAL_RESPONSE = "EXCEPTION STRING: {0}" ;
	public AutoController() {
		super();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		Logger.getLogger(getClass()).log(Level.INFO, "Se llego al controlador de consulta GET de Auto");
		String identificacion = request.getParameter("identificacion");
		AutoDAO autoDao = new AutoDAO();
		Auto auto = autoDao.consultar(identificacion);
		request.setAttribute("parametroauto", auto);
		try {
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/RespuestaConsultaAuto.jsp");
			rd.forward(request, response);
			Logger.getLogger(getClass()).log(Level.INFO, "Informacion enviada correctamente a: ./Paginas/RespuestaConsultaAuto.jsp");
		} catch (ServletException e) {
			Throwable th = e.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR, "Servlet Error EXCEPTION STRING: {0}" + e.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE, CRITUAL_RESPONSE + e.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"Servlet Error  THROWABLE MESSAGE: {0}" + th.toString());
		} catch (IOException io) {
			Throwable th = io.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR, "IO Error EXCEPTION STRING: {0}" + io.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE, CRITUAL_RESPONSE + io.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"IO Error  THROWABLE MESSAGE: {0}" + th.toString());
		}

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		Logger.getLogger(getClass()).log(Level.INFO, "Se llego al controlador de POST de Auto");
		Auto auto = new Auto();
		auto.setIdAuto(request.getParameter("identificacion"));
		auto.setMarca(request.getParameter("marca"));
		auto.setNombre(request.getParameter("nombre"));
		auto.setPlaca(request.getParameter("placa"));
		auto.setIdTipo(request.getParameter("tipo"));
		auto.setIdCiudad("1");
		auto.setValor(request.getParameter("valor"));
		AutoDAO adao = new AutoDAO();
		if (adao.insertar(auto)) {
			request.setAttribute("parametroauto", auto.getNombre());
			request.setAttribute("parametroplaca", auto.getPlaca());

			try {
				javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/AutoNuevo.jsp");
				rd.forward(request, response);
				Logger.getLogger(getClass()).log(Level.INFO, "Informacion enviada correctamente a: ./Paginas/AutoNuevo.jsp");
			} catch (ServletException e) {
				Throwable th = e.getCause();
				Logger.getLogger(getClass()).log(Level.ERROR, "Servlet Error EXCEPTION STRING: {0}" + e.getMessage());
				Logger.getLogger(getClass()).log(Level.TRACE, CRITUAL_RESPONSE+ e.toString());
				Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
						"Servlet Error  THROWABLE MESSAGE: {0}" + th.toString());
			} catch (IOException io) {
				Throwable th = io.getCause();
				Logger.getLogger(getClass()).log(Level.ERROR, "IO Error EXCEPTION STRING: {0}" + io.getMessage());
				Logger.getLogger(getClass()).log(Level.TRACE, CRITUAL_RESPONSE+ io.toString());
				Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
						"IO Error  THROWABLE MESSAGE: {0}" + th.toString());
			}
		}
	}

}
