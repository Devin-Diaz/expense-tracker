package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}
