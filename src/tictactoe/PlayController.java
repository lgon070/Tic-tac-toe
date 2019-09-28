package tictactoe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PlayController
 */
@WebServlet("/PlayController")
public class PlayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GameBean ttt = (GameBean) request.getSession().getAttribute("ttt");
		int location = Integer.parseInt(request.getParameter("location"));
		
		if(ttt.isValid(location)) {
			ttt.setMove(location);
			ttt.setPlayer();
			ttt.setTurn();
		}
		
		response.sendRedirect("GameController");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
