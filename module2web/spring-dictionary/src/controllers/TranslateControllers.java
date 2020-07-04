package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class TranslateControllers {
    private static Map<String, String> dictionary = new TreeMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("green", "màu xanh");
        dictionary.put("brown", "màu nâu");
        dictionary.put("library", "thư viện");
    }

    @GetMapping({"/translate"})
    public String showFindForm() {
        return "index";
    }

    @PostMapping({"/translate"})
    public ModelAndView show(@RequestParam("word") String word) {
        ModelAndView modelAndView = new ModelAndView("result");
        String resultWord = dictionary.get(word);
        modelAndView.addObject("word", word);
        modelAndView.addObject("result", resultWord);
        return modelAndView;
    }

}
