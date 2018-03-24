package com.mayank.item;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mayank.item.DAO;
import com.mayank.item.ItemDTO;

/**
 * Servlet implementation class AddCtrl
 */
@WebServlet("/addctrl")
public class AddCtrl extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setsNo(Integer.valueOf(request.getParameter("sNo")));
		itemDTO.setItemName(request.getParameter("itemName"));
		itemDTO.setItemPrice(request.getParameter("itemPrice"));
		itemDTO.setCGST(Double.valueOf(request.getParameter("taxCGST")));
		itemDTO.setSGST(Double.valueOf(request.getParameter("taxSGST")));
		itemDTO.setManufacturer(request.getParameter("manufacturer"));
		itemDTO.sethsnNo(Integer.valueOf(request.getParameter("hsnNo")));
		
		
			DAO dao = new DAO();
			if(dao.isAdded(itemDTO)) {
				PrintWriter out  = response.getWriter();
				out.println("Added Successfully");
			}
			
		
		
		

	
	}

}