package control.trading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DbConnetion;

/**
 * Servlet implementation class PortfolioAnalysis
 */
@WebServlet("/PortfolioAnalysis")
public class PortfolioAnalysis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PortfolioAnalysis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		DbConnetion a=new DbConnetion();
		ArrayList al=a.getPortFolio(1);
		request.setAttribute("s", al);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/trading/PortfolioAnalysis.jsp");
	    view.forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setAttribute(string, arg1)
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/trading/PortfolioAnalysis.jsp");
	    view.forward(request, response); 

	}

}
