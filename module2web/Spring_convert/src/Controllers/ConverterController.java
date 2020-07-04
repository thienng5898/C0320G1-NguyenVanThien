package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @PostMapping("/converter")
    public String calculate(@RequestParam("rate") float rate, @RequestParam("usd") float usd, Model model) {
        float vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "index";
    }
    @GetMapping("/converter")
    public String result(){
        return "index";
    }
}
