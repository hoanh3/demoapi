package demoapi.mvc.model;

public class TodoPreview {
	private int id;
	private String text;
	
	public TodoPreview(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public TodoPreview() {
		super();
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
	@Override
	public String toString() {
		return "TodoPreview [id=" + id + ", text=" + text + "]";
	}
}
