/**
 * 
 */

/**
 * @author sonal
 *
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class to create Http Servlet
public class RSSReader extends HttpServlet {

   private String mymsg;

   public void init() throws ServletException {
      mymsg = "Hello World!";
   }

   public void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException 
   {

      // Setting up the content type of webpage
      response.setContentType("text/html");
      String url="http://rss.nytimes.com/services/xml/rss/nyt/US.xml";
  	  FeedReader parser=new FeedReader(url);
      // Writing message to the web page
  	ArrayListFeed array=parser.readFeed();
	 //System.out.println(array);
    StringBuilder str = new StringBuilder();
	for (Feed message : array.getMessages()) {
     
       str.append(message.getTitle());
   } 
      PrintWriter out = response.getWriter();
      out.println("<h1>" + str.toString() + "</h1>");
   }

   public void destroy() {
      /* leaving empty for now this can be
       * used when we want to do something at the end
       * of Servlet life cycle
       */
   }
}
