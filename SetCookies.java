package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class SetCookies
 */
@WebServlet("/set")
public class SetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SetCookies() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String s1=request.getParameter("b1");
			String s2=request.getParameter("b2");
			String s3=request.getParameter("b3");
			if(s1!=null) {
				Cookie c1=new Cookie("b1",s1);
				response.addCookie(c1);
			}
			if(s2!=null) {
				Cookie c2=new Cookie("b2",s2);
				response.addCookie(c2);
			}
			if(s3!=null) {
				Cookie c3=new Cookie("b3",s3);
				response.addCookie(c3);
			}
			PrintWriter pw=response.getWriter();
			pw.println("<html><body>");
			pw.println("Your Books are added to Cart <br>");
			pw.println("<a href=get>View your Books</a>");
			pw.println("</body></html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
