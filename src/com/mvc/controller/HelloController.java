package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.lang.invoke.MethodType;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
  public String sayHello(ModelMap model){
        model.addAttribute("msg","hello");
    return "hello";
  }
  @RequestMapping("/helloagain")
  public String sayHelloAgain(ModelMap model){
      model.addAttribute("msg","hello again");
      return "hello";
  }
}
