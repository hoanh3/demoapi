package demoapi.mvc.controller.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import demoapi.mvc.model.Todo;
import demoapi.mvc.model.TodoPreview;
import demoapi.mvc.service.TodoService;
import demoapi.mvc.service.impl.TodoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todo/*")
public class TodoApi extends HttpServlet{
	
	private TodoService _todoService = new TodoServiceImpl();
	private Gson _gson = new Gson();
	
	private void sentAsJson(HttpServletResponse resp, Object object) throws IOException{
		resp.setContentType("application/json");
		
		String res = _gson.toJson(object);
		
		PrintWriter out = resp.getWriter();
		
		resp.setStatus(200);
		out.print(res);
		out.flush();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pathInfo = req.getPathInfo();
		if(pathInfo == null || pathInfo.equals("/")) {
			List<TodoPreview> todoList = _todoService.getAll();
			sentAsJson(resp, todoList);
			return;
		}
		String[] splits = pathInfo.split("/");
		if(splits.length > 2) {
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		int todoId = Integer.parseInt(splits[1]);
		Todo todo = _todoService.getTodoById(todoId);
		if(todo == null) {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		sentAsJson(resp, todo);
		return;
	}
}
