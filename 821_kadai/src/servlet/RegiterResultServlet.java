package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HouseholdDao;

/**
 * Servlet implementation class RegiterResultServre
 */
@WebServlet("/RegiterResultServlet")
public class RegiterResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegiterResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String key2 = request.getParameter("date");
		String key3 = request.getParameter("income");
		String key4 = request.getParameter("spending");
		String key5 = request.getParameter("balanceg");
		String key6 = request.getParameter("type");

		if("".equals(key2)||"".equals(key3)||"".equals(key4)||"".equals(key5)||"".equals(key6)){
			String view = "/WEB-INF/view/RegisterResult2.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}else{

			HouseholdDao.newDataDAO(key2,key3,key4,key5,key6);
			String view = "/WEB-INF/view/RegisterResult.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
