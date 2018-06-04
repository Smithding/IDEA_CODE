package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

/**
 *
 */
@Controller
public class DemoController {
    @RequestMapping("/demo")
    public ModelAndView showIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello world");
        modelAndView.addObject("true01","nihao1");
        modelAndView.setViewName("demo");
        return modelAndView;
    }

}
