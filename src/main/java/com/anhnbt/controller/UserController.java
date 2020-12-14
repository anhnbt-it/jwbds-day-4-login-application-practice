package com.anhnbt.controller;

import com.anhnbt.dao.UserDao;
import com.anhnbt.model.Login;
import com.anhnbt.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/login")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User user = UserDao.checkLogin(login);

        ModelAndView modelAndView = new ModelAndView();
        if (user == null) {
            modelAndView.setViewName("error");
        } else {
            modelAndView.setViewName("user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
