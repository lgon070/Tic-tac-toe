package tictactoe;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NewGameController
 */
@WebServlet("/NewGameController")
public class NewGameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session = request.getSession();
		
		GameBean newGame = new GameBean();
		
		//getServletContext().removeAttribute("ttt");
		
		//getServletContext().setAttribute("ttt", newGame);
		
		session.removeAttribute("ttt");
		
		session.setAttribute("ttt", newGame);
		
		response.sendRedirect("GameController");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
