package com.user.user_service.Controller;

import com.user.user_service.Entity.Contact;
import com.user.user_service.Entity.User;
import com.user.user_service.Service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserControllerImpl {

    @Autowired
    private UserSerivce userSerivce;

    @Autowired
   private RestTemplate restTemplate;

    @GetMapping("/{userid}")
    public User getUser(@PathVariable("userid") Long userid){

        //http://localhost:9002/contact/user/1000

       User user = this.userSerivce.getUser(userid);
        try {
            List contact = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(), List.class);
            user.setContactList(contact);
        } catch (RestClientException e) {
            // Log the exception and handle it
            System.err.println("Failed to connect to the service: " + e.getMessage());
            // Optionally set a default value or retry the request
        }
        return user;
    }
}
