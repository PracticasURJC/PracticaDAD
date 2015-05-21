package practica2.postealo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import practica2.postealo.model.Note;
import practica2.postealo.model.Reply;
import practica2.postealo.model.Text;


@RestController
public class PostealoRestController {
	
	RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private NoteRepository repository;

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Note> getNotes() {
        return repository.findAll();
    }

    @RequestMapping(value = "/notes/{user}", method = RequestMethod.GET)
    public List<Note> getNotes(@PathVariable("user") String user) {
        return repository.findByAuthor(user);
    }
   
    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    	public @ResponseBody void addNote(@RequestBody Note note) {
    		Text text = note.toText();
    		String url = "http://localhost:8080/analysis";        
            Reply reply = (Reply) restTemplate.getForObject(url, Reply.class);
            if(reply.isClean())
            	repository.save(note);
            
            
    		// devuelve 400 si Pandemonium dice que tiene virus 
    }
    
    @RequestMapping(value = "/notes/{noteId}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteNote(@PathVariable("noteId") long noteId) {
        repository.delete(noteId);
        
        // devuelve 404 si no existe la nota
    }
  

}