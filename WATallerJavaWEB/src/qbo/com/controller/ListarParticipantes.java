package qbo.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import qbo.com.model.Participante;

/**
 * Servlet implementation class ListarParticipantes
 */
@WebServlet("/ListarParticipantes")
@SuppressWarnings("unchecked")
public class ListarParticipantes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListarParticipantes() {
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
		HttpSession sesion = request.getSession();
		ArrayList<Participante> listparticipante = (ArrayList<Participante>) sesion.getAttribute("listparticipante");
		if (listparticipante.size() > 0) {
			request.setAttribute("listparticipante", listparticipante);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listarparticipante.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
