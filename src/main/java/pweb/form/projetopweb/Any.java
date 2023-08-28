package pweb.form.projetopweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Any {
    
    
    @GetMapping("/any")
    public String showAny() {
        String a = "Alguma coisa";
        return a;
    } 


}
