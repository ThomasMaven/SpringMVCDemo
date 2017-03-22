package com.mkyong.web.controller;

import com.mkyong.web.model.User;
import com.mkyong.web.repo.KontaktListRepo;
import com.mkyong.web.repo.UserDTO;
import com.mkyong.web.repo.UserRepo;
import com.mkyong.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by ttomaka on 21.03.2017.
 */
@Controller
public class KontaktController {
    @Autowired
    KontaktListRepo kontaktListRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public String showKontaktList(ModelMap model) {
        model.addAttribute("kontaktList", kontaktListRepo.getAllContactsAsString());
        return "kontaktList";
    }

    @RequestMapping(value = "/kontakt/addForm", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("kontaktAddForm", "user", new User());
    }

    @RequestMapping(value = "/kontakt/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("user")User user, ModelMap model, BindingResult result) {
        userRepo.saveUser(user);
        model.addAttribute("userFirstname", user.getUserFirstname());
        model.addAttribute("userLastname", user.getUserLastname());
        model.addAttribute("saved", "added!");
        return "kontaktAddForm";
    }





    @RequestMapping(value = "/kontakt/addFormUserAndKontakt", method = RequestMethod.GET)
    public ModelAndView showFormUserAndKontakt() {
        return new ModelAndView("kontaktAddFormUserAndKontakt", "kontaktList", new UserDTO());
    }

    @RequestMapping(value = "/kontakt/addContactAndUser", method = RequestMethod.POST)
    public String addContactAndUser(@ModelAttribute("kontaktList")UserDTO userDTO, ModelMap model, BindingResult result) {
        userService.saveUserContacts(userDTO);
        model.addAttribute("saved", "SAVED!");
        return "kontaktList";
    }
}
