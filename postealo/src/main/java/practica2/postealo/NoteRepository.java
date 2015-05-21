package practica2.postealo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import practica2.postealo.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
	
	List<Note> findByAuthor(String author);
	Note findByContent(String content);

}
