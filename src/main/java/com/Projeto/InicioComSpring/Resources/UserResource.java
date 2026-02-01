package com.Projeto.InicioComSpring.Resources;

import com.Projeto.InicioComSpring.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u =  new User(1L, "Braga","Braga@Gmail.com","11986992569", "12345");
        return ResponseEntity.ok().body(u);
    }
}
