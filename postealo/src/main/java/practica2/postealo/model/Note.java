package practica2.postealo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String author;
	private String content;
	private String tag;
	
	public Note(){
		
	}
	
	public Text toText(){
		Text txt = new Text(this.content);
		return txt;
	}
	
	public long getId() {
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
	
	public void setId(long id) {
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
