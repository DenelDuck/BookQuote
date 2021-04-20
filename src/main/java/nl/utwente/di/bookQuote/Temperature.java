package nl.utwente.di.bookQuote;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Example of a Servlet that gets an ISBN number and returns the book price
 */

public class Temperature extends HttpServlet {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TemperatureCalc temperatureCalc;
	
    public void init() throws ServletException {
    	temperatureCalc = new TemperatureCalc();
    }	
	
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String docType =
      "<!DOCTYPE HTML>\n";
    String title = "Temperature Converter"; 
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>Temperature in celsius " +
                   request.getParameter("celsius") + "\n" +
                "  <P>Price: " +
                   Double.toString(temperatureCalc.toFahrenheit(request.getParameter("celsius"))) +
                "</BODY></HTML>");
  }
  

}
