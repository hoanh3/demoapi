package demoapi.mvc.service.impl;

import java.util.List;

import demoapi.mvc.dao.TodoDao;
import demoapi.mvc.dao.impl.TodoDaoImpl;
import demoapi.mvc.model.Todo;
import demoapi.mvc.model.TodoPreview;
import demoapi.mvc.service.TodoService;

public class TodoServiceImpl implements TodoService{
	
	private TodoDao _todoDao = new TodoDaoImpl();

	@Override
	public List<TodoPreview> getAll() {
		// TODO Auto-generated method stub
		return _todoDao.getAll();
	}

	@Override
	public Todo getTodoById(int id) {
		// TODO Auto-generated method stub
		return _todoDao.getTodoById(id);
	}

	@Override
	public void insertTodo(Todo todo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTodo(int id) {
		// TODO Auto-generated method stub
		
	}

}
