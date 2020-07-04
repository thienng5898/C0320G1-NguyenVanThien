package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SandwichController {
    @PostMapping("/save")
    public String save(@RequestParam(defaultValue = "") String[] condiment, Model model){
        model.addAttribute("condiments",condiment);
        return "sandwich" ;
    }
    @GetMapping("/save")
    public String sandwich(){
        return "sandwich" ;
    }
}
