package qbo.com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import qbo.com.model.Participante;

/**
 * Servlet implementation class RegistarParticipante
 */
@WebServlet("/RegistarParticipante")
@SuppressWarnings("unchecked")
public class RegistarParticipante extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistarParticipante() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombres = request.getParameter("txtnombre");
		String apellidos = request.getParameter("txtapellido");
		String especialidad = request.getParameter("txtespecialidad");
		UUID id = UUID.randomUUID();
		Participante objparticipante = new Participante(id, nombres, apellidos, especialidad);
		HttpSession sesion = request.getSession();
		ArrayList<Participante> listparticipante = new ArrayList<>();
		if (sesion.getAttribute("listparticipante") != null) {
			listparticipante = (ArrayList<Participante>) sesion.getAttribute("listparticipante");
		}
		listparticipante.add(objparticipante);
		sesion.setAttribute("listparticipante", listparticipante);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/registrarparticipante.jsp");
		dispatcher.forward(request, response);
	}

}
