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

import model.DAOs.ClienteDAO;
import model.DTOs.Cliente;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UsuarioController() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llegue al controlador NEW GET...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llegue al controlador NEW POST...");
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
			System.out.println(fechanacimiento + "\t" + date);
			cliente.setFechNac(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("HASTA AQUI BIEN");
		ClienteDAO cdao = new ClienteDAO();
		if(cdao.insertar(cliente)){
			request.setAttribute("parametronombre", cliente.getNombre1());
	        request.setAttribute("parametroapellido", cliente.getApellido1());
	        javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("./Paginas/BienvenidoUsuario.jsp");
	        rd.forward(request, response);
		}		
	}

}
