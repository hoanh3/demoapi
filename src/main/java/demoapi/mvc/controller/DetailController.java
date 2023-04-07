package demoapi.mvc.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/detail/*")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pathInfo = req.getPathInfo();
		
		String[] splits = pathInfo.split("/");
		if(splits.length > 2) {
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		
		int todoId = Integer.parseInt(splits[1]);
		
		req.setAttribute("todoId", todoId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/detail.jsp");
		dispatcher.forward(req, resp);
	}
}
