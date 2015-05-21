package practica2.postealo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import practica2.postealo.model.Note;


@RestController
public class PostealoRestController {

    @Autowired
    private PostealoService service;

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Note> getNotes() {
        return service.getNotes();
    }

    @RequestMapping(value = "/notes/{user}", method = RequestMethod.GET)
    public List<Note> getNotes(@PathVariable("user") String user) {
        return service.getNotesOf(user);
    }
   
    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    	public @ResponseBody void addNote(@RequestBody Note note) {
    		service.addNote(note);
    		// devuelve 400 si Pandemonium dice que tiene virus 
    }
    
    @RequestMapping(value = "/notes/{noteId}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteNote(@PathVariable("noteId") int noteId) {
        service.deleteNote(noteId);
        // devuelve 404 si no existe la nota
    }
  

}