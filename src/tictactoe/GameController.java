package tictactoe;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GameController
 */
@WebServlet("/GameController")
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		GameBean ttt = new GameBean();
		 getServletContext().setAttribute("game",ttt);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session;
		if(request.getSession() == null) {
			GameBean game = (GameBean) getServletContext().getAttribute("game");
			
			session = request.getSession(true);
			session.setAttribute("ttt", game);
			getServletContext().removeAttribute("game");
		}

		request.getRequestDispatcher("/WEB-INF/tictactoe/GameView.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
