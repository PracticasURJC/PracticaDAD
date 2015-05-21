package practica2.pandemonium;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import practica2.pandemonium.model.Text;


public interface TextRepository extends JpaRepository<Text, Long> {
	
	List<Text> findByCompany(String company);

}
