package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ttomaka on 20.03.2017.
 */
@Controller
public class AddController {
    @RequestMapping(value = "addApi/{num1:.+}/{num2:.+}")
    public ModelAndView addApi(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {

        int result = num1 + num2;
        ModelAndView model = new ModelAndView();
        model.setViewName("addApi");

        model.addObject("result", result);

        return model;

    }
}