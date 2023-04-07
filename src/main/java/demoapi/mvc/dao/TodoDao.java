package demoapi.mvc.dao;

import java.util.List;

import demoapi.mvc.model.Todo;
import demoapi.mvc.model.TodoPreview;

public interface TodoDao {
	List<TodoPreview> getAll();
	Todo getTodoById(int id);
	void insertTodo(Todo todo);
	void updateTodo(Todo todo);
	void deleteTodo(int id);
}
