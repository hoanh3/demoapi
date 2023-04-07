package demoapi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import demoapi.mvc.dao.TodoDao;
import demoapi.mvc.dbconnect.MSSQLConnector;
import demoapi.mvc.model.Todo;
import demoapi.mvc.model.TodoPreview;

public class TodoDaoImpl implements TodoDao {
	
	private Connection _connection = null;
	private PreparedStatement _prepateStatement = null;
	private ResultSet _resultSet = null;

	@Override
	public List<TodoPreview> getAll() {
		String query = "SELECT [id], [text] FROM [dbo].[todo]";
		List<TodoPreview> todoList = new ArrayList<>();
		try {
			_connection = MSSQLConnector.getConnection();
			_prepateStatement = _connection.prepareStatement(query);
			_resultSet = _prepateStatement.executeQuery();
			while(_resultSet.next()) {
				int id = _resultSet.getInt(1);
				String text = _resultSet.getString(2);
				todoList.add(new TodoPreview(id, text));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("loi getAllDao");
		}
		return todoList;
	}

	@Override
	public Todo getTodoById(int id) {
		String query = "SELECT * FROM [dbo].[todo]"
					+ "WHERE [id] = ?";
		Todo todo = null;
		try {
			_connection = MSSQLConnector.getConnection();
			_prepateStatement = _connection.prepareStatement(query);
			_prepateStatement.setInt(1, id);
			_resultSet = _prepateStatement.executeQuery();
			while(_resultSet.next()) {
				int nid = _resultSet.getInt(1);
				String text = _resultSet.getString(2);
				Date deadline = _resultSet.getDate(3);
				todo = new Todo(nid, text, deadline);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("loi getTodoByIdDao");
		}
		return todo;
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
