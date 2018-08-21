package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HouseholdDao;
import dto.HouseholdDto;
import dto.ReturnI;

/**
 * Servlet implementation class AllServret
 */
@WebServlet("/AllServret")
public class AllServret extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllServret() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<HouseholdDto> list = HouseholdDao.getAll();
		int i = 0;
		for(HouseholdDto result : list){
			int number = result.getNumber();
			String date = result.getDate();
			String income = result.getIncome();
			String spending = result.getSpending();
			String balanceg = result.getBalanceg();
			String type = result.getType();
			HouseholdDto data = new HouseholdDto(number,date,income,spending,balanceg,type);
			String rs = "rs" + i;
			request.setAttribute(rs,data);
			i++;
		}
		ReturnI ri = new ReturnI(i);
		request.setAttribute("inum",ri);


		request.setCharacterEncoding("UTF-8");
		String view = "/WEB-INF/view/All.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
