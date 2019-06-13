package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PassTest;
import model.User;

/**
 * Servlet implementation class Regist
 */
@WebServlet("/Regist")
public class Regist extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("logName");
		String pass =request.getParameter("logPass");
		 PassTest.GetPass(pass);
		User user = new User();

		user.setName(name);
		user.setPass(pass);

		//Userリストにユーザ情報を格納
		List<User> users = new ArrayList<User>();
		users.add(user);

		//アプリケーションスコープに保存
		request.setAttribute("user",user);

		//フォワード registResult
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registResult.jsp");
		dispatcher.forward(request, response);
	}

}
