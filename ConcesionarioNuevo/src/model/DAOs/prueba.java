package model.DAOs;

import java.util.Date;

import model.DTOs.Cliente;

public class prueba {
	public static void main(String [ ] args) {
		Cliente cl = new Cliente();
		cl.setIdentificacion("1000100700");
		Date date = new Date();
		cl.setFechNac(date);
		cl.setUsuario("pedrito");
		cl.setContrasena("1234");
		ClienteDAO cd = new ClienteDAO();
		cd.insertar(cl);
	}
}