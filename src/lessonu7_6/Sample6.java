package lessonu7_6;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybeans.CarBean;

public class Sample6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		try {
			String carname = request.getParameter("cars");

			CarBean cb = new CarBean();
			cb.setCarname(carname);
			cb.makeCardata();

			request.setAttribute("cb", cb);

			ServletContext sc = getServletContext();

			if(carname.length() != 0) {
				sc.getRequestDispatcher("/Sample6.jsp").forward(request, response);
			}
			else {
				sc.getRequestDispatcher("/error.html").forward(request, response);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
