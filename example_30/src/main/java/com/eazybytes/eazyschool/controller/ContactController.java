package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ContactController {

    private static final Logger log = LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value={"/contact"})
    public String displayContact(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

//    @RequestMapping(value={"/saveMsg"})
//    public ModelAndView saveMsg(@RequestParam String name,@RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject,
//    @RequestParam String message) {
//        log.info("Name: " + name);
//        log.info("Mobile Number: " + mobileNum);
//        log.info("Email: " + email);
//        log.info("Subject: " + subject);
//        log.info("message:" + message);
//        return new ModelAndView("redirect:/contact");
//    }

    @RequestMapping(value={"/saveMsg"})
    public String saveMsg(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
        if(errors.hasErrors()){
            log.info("Contact Form Validation failed due to  :{} ", errors.toString());
            return "contact";
        }
        contactService.saveContactMessage(contact);
        contactService.setCounterbean(contactService.getCounterbean()+1);
        log.info("ContactService bean created for the request {}", contactService.getCounterbean());
        return "redirect:/contact";
    }
}
