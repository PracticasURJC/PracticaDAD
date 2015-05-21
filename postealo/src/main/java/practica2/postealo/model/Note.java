package practica2.postealo.model;

public class Note {
	
	private int id;
	
	private String author;
	private String content;
	private String tag;
	
	public int getId() {
		return id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}

}
