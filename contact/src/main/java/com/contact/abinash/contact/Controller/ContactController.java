package com.contact.abinash.contact.Controller;

import com.contact.abinash.contact.Entity.Contact;
import com.contact.abinash.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {


    @Autowired
   private ContactService contactService;

    @RequestMapping("/user/{userid}")
    public List<Contact> getContacts(@PathVariable("userid") Long userid){
        return this.contactService.getContactsOfUsers(userid);
    }
}
