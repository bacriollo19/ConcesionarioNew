package org.taller.model.DAOs;

import java.util.Date;

import org.taller.model.DTOs.Cliente;

public class prueba {
	public static void main(String [ ] args) {
		Cliente cl = new Cliente();
		cl.setIdentificacion("1000400100");
		Date date = new Date();
		cl.setFechNac(date);
		cl.setUsuario("carlito58");
		cl.setContrasena("1234");
		ClienteDAO cd = new ClienteDAO();
		cd.insertar(cl);
	}
}