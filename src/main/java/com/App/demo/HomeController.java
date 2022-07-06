package com.App.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")

    public ModelAndView home(Alien alien)
    {
       // HttpSession session = req.getSession();

       // String name = req.getParameter("name");
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj" , alien);
        mv.setViewName("home");
        //System.out.println("in " + name1);
        //session.setAttribute("name",name1);

        return mv;
    }
}
