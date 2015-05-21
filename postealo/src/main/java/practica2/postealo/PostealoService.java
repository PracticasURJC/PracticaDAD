package practica2.postealo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import practica2.postealo.model.Note;

@Component
public class PostealoService {
	
	private List<Note> notes = new ArrayList<Note>();
	
	public List<Note> getNotes(){
		return null;
	}
	
	public List<Note> getNotesOf(String author){
		return null;
	}
	
	public void addNote(Note note){
		
		notes.add(note);
	}
	
	public void deleteNote(int id){
		
	}
	
	

}
