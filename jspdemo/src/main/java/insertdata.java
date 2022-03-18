

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertdata")
public class insertdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public insertdata() {
        super();  
    }  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param=request.getParameter("page");
				if(param.equals("form"))
				{
					getServletContext().getRequestDispatcher("/form.jsp").forward(request,response);
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//step 1:int database
			Connection obj=dbconnect.initializeDatabase();
			//step 2:create query
			PreparedStatement st=obj.prepareStatement("insert into formdata(?,?,?)");
			//step 3:for each column set values
			st.setString(1, request.getParameter("emailId"));
			st.setString(2, request.getParameter("password"));
			st.setString(3, request.getParameter("fullname"));
			// step 4:execute sql query 
			st.executeUpdate();
			//close the connection
			st.close();
			//also close the object
			obj.close();
			PrintWriter out=response.getWriter();
			out.print("data successfully got inserted");
			
			
			
			
		} 
		catch (Exception e) {
			 
			e.printStackTrace();
		} 
		
		}
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
