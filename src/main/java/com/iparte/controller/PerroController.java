package com.iparte.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.modelo.PerroDAOBBDD;
import com.ipartek.pojo.Perro;

/**
 * @WebServlet("/perro") es la URL donde escucha este controlador
 */
@WebServlet("/listaPerros")
public class PerroController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Perro> lista = new ArrayList<Perro>();

		// conseguir perros llamado al modelo
		try {
			PerroDAOBBDD dao = PerroDAOBBDD.getInstance();
			lista = dao.listar();

		} catch (Exception e) {

			e.printStackTrace();

		}

		// enviarlos a la JSP
		request.setAttribute("listaPerros", lista);

		// ir a la JSP
		request.getRequestDispatcher("listaPerros.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recibri datos del formulario, fijaros en el input el atributo 'name'
		String parametroNombre = request.getParameter("nombre");
		String raza = request.getParameter("raza");
		// boolean isVacunado = request.getParameter("vacunado");

		Perro p = new Perro();
		p.setNombre(parametroNombre);
		p.setRaza(raza);

		PerroDAOBBDD dao = PerroDAOBBDD.getInstance();
		try {
			dao.crear(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// enviarlos a la JSP
		request.setAttribute("perro", p);

		// ir a la JSP
		request.getRequestDispatcher("perros.jsp").forward(request, response);
	}
}
