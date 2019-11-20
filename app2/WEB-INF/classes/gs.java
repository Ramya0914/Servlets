import javax.servlet.*;
import java.io.*;
public class gs extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>hello i am generic servlet you have called me<h1>");
		System.out.println("this is service method");
	}
}