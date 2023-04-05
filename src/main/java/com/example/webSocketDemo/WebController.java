package com.example.webSocketDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
    @RequestMapping("/mychatt")
    public ModelAndView chatt() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("chatting");
        return mv;
    }
    @GetMapping
    public String root(){
        return "test";
    }
}
