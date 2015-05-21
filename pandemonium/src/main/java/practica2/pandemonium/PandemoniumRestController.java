package practica2.pandemonium;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import practica2.pandemonium.model.Reply;
import practica2.pandemonium.model.Text;


@RestController
public class PandemoniumRestController {
	
	@Autowired
    private TextRepository repository;

    @RequestMapping(value = "/analysis", method = RequestMethod.POST)
    public @ResponseBody Reply getResult(@RequestBody Text text) {
        return null;
        // devuelve 200 si no tiene virus y 400 si tiene
    }
    
    @RequestMapping(value = "/texts/{company}", method = RequestMethod.GET)
    public @ResponseBody List<Text> getCompanyTexts(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    

}
