package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAOs.AutoDAO;
import model.DAOs.ClienteDAO;
import model.DAOs.VentaDAO;
import model.DTOs.Venta;

@WebServlet("/VentaController")
public class VentaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VentaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llego al GET");
		String identificacion = request.getParameter("identificacion");
		VentaDAO ventaDao = new VentaDAO();
		Venta venta = ventaDao.consultar(identificacion);
		request.setAttribute("parametroventa", venta);
		javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/RespuestaConsultaVenta.jsp");
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llego al POST");
		ClienteDAO cd = new ClienteDAO();
		AutoDAO ad= new AutoDAO();
		VentaDAO vd = new VentaDAO();
		Venta venta = new Venta();
		venta.setIdVenta(request.getParameter("idVenta"));
		venta.setValor(Integer.parseInt(request.getParameter("valor")));
		venta.setCliente(cd.consultar(request.getParameter("idCliente")));
		venta.setAuto(ad.consultar(request.getParameter("idAuto")));
		Date fecha = new Date();
		venta.setFecha(fecha);
		System.out.println("HASTA AQUI BIEN");
		if(vd.insertar(venta)){
			request.setAttribute("parametroauto", venta.getAuto().getNombre());
	        request.setAttribute("parametronombre", venta.getCliente().getNombre1());
	        javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/VentaExitosa.jsp");
	        rd.forward(request, response);
		}		
	}

}
