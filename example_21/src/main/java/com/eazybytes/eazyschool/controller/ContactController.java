package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private static final Logger log = LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value={"/contact"})
    public String displayContact() {
        return "contact.html";
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
    public ModelAndView saveMsg(Contact contact) {
        contactService.saveContactMessage(contact);
        return new ModelAndView("redirect:/contact");
    }
}
