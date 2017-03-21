package com.mkyong.web.controller;


import com.mkyong.web.repo.KontaktListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by ttomaka on 21.03.2017.
 */
@Controller
public class KontaktController {
    @Autowired
    KontaktListRepo kontaktListRepo;

    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public String showKontaktList(ModelMap model) {
        model.addAttribute("kontaktList", kontaktListRepo.getAllContactsAsString());
        return "kontaktList";
    }
}
