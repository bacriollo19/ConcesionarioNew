package org.taller.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.taller.model.DAOs.AutoDAO;
import org.taller.model.DAOs.ClienteDAO;
import org.taller.model.DAOs.VentaDAO;
import org.taller.model.DTOs.Venta;

@WebServlet("/VentaController")
public class VentaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final Logger logger = Logger.getLogger(UsuarioController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VentaController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Llego al GET");
		String identificacion = request.getParameter("identificacion");
		VentaDAO ventaDao = new VentaDAO();
		Venta venta = ventaDao.consultar(identificacion);
		request.setAttribute("parametroventa", venta);
		javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/RespuestaConsultaVenta.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Llego al POST");
		ClienteDAO cd = new ClienteDAO();
		AutoDAO ad = new AutoDAO();
		VentaDAO vd = new VentaDAO();
		Venta venta = new Venta();
		venta.setIdVenta(request.getParameter("idVenta"));
		venta.setValor(Integer.parseInt(request.getParameter("valor")));
		venta.setCliente(cd.consultar(request.getParameter("idCliente")));
		venta.setAuto(ad.consultar(request.getParameter("idAuto")));
		Date fecha = new Date();
		venta.setFecha(fecha);
		System.out.println("HASTA AQUI BIEN");
		if (vd.insertar(venta)) {
			request.setAttribute("parametroauto", venta.getAuto().getNombre());
			request.setAttribute("parametronombre", venta.getCliente().getNombre1());
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/VentaExitosa.jsp");
			rd.forward(request, response);
		}
	}

}
