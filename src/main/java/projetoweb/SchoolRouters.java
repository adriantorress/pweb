package projetoweb;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.validation.Valid;

@Controller
public class SchoolRouters implements WebMvcConfigurer {
  
  @Autowired
  SchoolRepository schoolRepository;

  @Override
	public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("/home");
    registry.addViewController("/students").setViewName("students");
		registry.addViewController("/response").setViewName("response");		
	}

  @GetMapping("/")
  public String showForm(SchoolModel student) {
    return "index";
  } 

  @PostMapping("/")
  public String getDataForm(@Valid SchoolModel student, BindingResult result) {
    if(result.hasErrors()) {
        return "response"; 
    }

    if (!isValidDDD(student.getDdd())) {
        result.rejectValue("ddd", "DDDInvalido", "DDD inválido");
        return "response";
    }

    if (student.getAtividades() != null && student.getAtividades().length> 3) {
        result.rejectValue("activities", "MuitasAtividades", "Máximo de 3 atividades permitidas");
        return "response";
    }

    schoolRepository.save(student);
    return "response"; 
  }


  @GetMapping(value="/students")
  public String showStudents(Model model) {
    Iterable<SchoolModel> students = schoolRepository.findAll();
    model.addAttribute("students", students);
    return "students";
  }

  private boolean isValidDDD(String ddd) {
    List<String> validDDDs = Arrays.asList("61","62","64","65","66","67","82","71", "73", "74", "75","77","85","88","98","99","83","81","87","86","89","84","79","68","96","92","97","91","93","94","69","95","63","27","28","31","32","33","34","35","37","38","21","22","24","11","12","13","14","15","16","17","18","19","41","42","43","44","45","46","51","53","54","55","47","48","49"); 
    return validDDDs.contains(ddd);
}

  
}
