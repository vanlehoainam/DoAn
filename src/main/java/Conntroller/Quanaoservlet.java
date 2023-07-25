package Conntroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Quanao;
import Model.Quanaomodel;

/**
 * Servlet implementation class Quanaoservlet
 */
@WebServlet("/quanaoservlet")
public class Quanaoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Quanaomodel model;

	@Override
	public void init() throws ServletException {
		model = new Quanaomodel();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quanaoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<Quanao> quanaolList = model.getAllNhaSanXuat();
			request.setAttribute("quanaolList", quanaolList);
			request.getRequestDispatcher("view/list_quanao.jsp").forward(request, response);;
		} catch (Exception e) {
			e.printStackTrace();
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
