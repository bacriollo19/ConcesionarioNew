package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import model.DAOs.ClienteDAO;
import model.DTOs.Cliente;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	static final Logger logger = Logger.getLogger(UsuarioController.class);
	private static final long serialVersionUID = 1L;

	public UsuarioController() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		Logger.getLogger(getClass()).log(Level.INFO, "Se llego al controlador de consulta GET de USUARIO");
		String identificacion = request.getParameter("identificacion");
		ClienteDAO cd = new ClienteDAO();
		Cliente cliente = cd.consultar(identificacion);
		request.setAttribute("parametrocliente", cliente);
		try {
			javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/RespuestaConsultaCliente.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			Throwable th = e.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR, "Servlet Error EXCEPTION STRING: {0}" + e.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE, "EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"Servlet Error  THROWABLE MESSAGE: {0}" + th.toString());
		} catch (IOException io) {
			Throwable th = io.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR, "IO Error EXCEPTION STRING: {0}" + io.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE, "EXCEPTION STRING: {0}" + io.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"IO Error  THROWABLE MESSAGE: {0}" + th.toString());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Logger.getLogger(getClass()).log(Level.INFO, "Se llego al controlador de consulta POST de USUARIO");
		String fechanacimiento = request.getParameter("fechanacimiento");
		Cliente cliente = new Cliente();
		cliente.setIdentificacion(request.getParameter("identificacion"));
		cliente.setNombre1(request.getParameter("nombre1"));
		cliente.setNombre2(request.getParameter("nombre2"));
		cliente.setApellido1(request.getParameter("apellido1"));
		cliente.setApellido2(request.getParameter("apellido2"));
		cliente.setTelefono(request.getParameter("telefono"));
		cliente.setCorreo(request.getParameter("email"));
		cliente.setTipo(request.getParameter("tipopersona"));
		cliente.setUsuario(request.getParameter("usuario"));
		cliente.setContrasena(request.getParameter("contrasena"));
		Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(fechanacimiento);
			Logger.getLogger(getClass()).log(Level.INFO, fechanacimiento + "\t" + date);
			cliente.setFechNac(date);
		} catch (ParseException e) {
			Throwable th = e.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR,
					"Error de conversión de fecha EXCEPTION STRING: {0}" + e.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE, "EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"Error de conversión de fecha THROWABLE MESSAGE: {0}" + th.toString());
		}
		ClienteDAO cdao = new ClienteDAO();
		if (cdao.insertar(cliente)) {
			request.setAttribute("parametronombre", cliente.getNombre1());
			request.setAttribute("parametroapellido", cliente.getApellido1());
			try {
				javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/BienvenidoUsuario.jsp");
				rd.forward(request, response);
				Logger.getLogger(getClass()).log(Level.INFO, "Informacion enviada correctamente a: ./Paginas/BienvenidoUsuario.jsp");
			} catch (ServletException e) {
				Throwable th = e.getCause();
				Logger.getLogger(getClass()).log(Level.ERROR, "Servlet Error EXCEPTION STRING: {0}" + e.getMessage());
				Logger.getLogger(getClass()).log(Level.TRACE, "EXCEPTION STRING: {0}" + e.toString());
				Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
						"Servlet Error  THROWABLE MESSAGE: {0}" + th.toString());
			} catch (IOException io) {
				Throwable th = io.getCause();
				Logger.getLogger(getClass()).log(Level.ERROR, "IO Error EXCEPTION STRING: {0}" + io.getMessage());
				Logger.getLogger(getClass()).log(Level.TRACE, "EXCEPTION STRING: {0}" + io.toString());
				Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
						"IO Error  THROWABLE MESSAGE: {0}" + th.toString());
			}
		}
	}

}
