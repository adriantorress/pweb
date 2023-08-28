package pweb.form.projetopweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Formulario {
    
    
    @GetMapping("/")
    public String showForm(FormularioModel formulario) {
        return "index";
    } 


}
