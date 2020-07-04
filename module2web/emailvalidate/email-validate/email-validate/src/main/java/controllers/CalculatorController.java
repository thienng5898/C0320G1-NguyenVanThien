package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @PostMapping("/calculator")
    public String calculator(@RequestParam("number1") double number1, @RequestParam("number2") double number2, Model model, @RequestParam("calculating") String calculating) {
        double result;
        switch (calculating){
            case "+" : result=number1+number2 ;
            break;
            case "-" : result=number1-number2 ;
            break;
            case "*" : result=number1*number2 ;
            break;
            case "/" :
                result=number1/number2 ;
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + calculating);
        }
        model.addAttribute("result",result);
        return "calculator" ;
    }
    @GetMapping("/calculator")
    String showCalculator(){
        return "calculator" ;
    }
}
