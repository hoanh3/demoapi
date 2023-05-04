package demoapi.mvc.model;

import java.sql.Date;

public class Todo {
	private int id;
	private String text;
	private Date deadline;
	
	public Todo() {
		super();
	}

	public Todo(int id, String text, Date deadline) {
		super();
		this.id = id;
		this.text = text;
		this.deadline = deadline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", text=" + text + ", deadline=" + deadline + "]";
	}
	
	
}
