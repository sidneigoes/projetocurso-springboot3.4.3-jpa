package com.sidneigoes.project.resources;

import com.sidneigoes.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Sidnei","sidneicgoes@gmail.com","11978880881","12345");
        return ResponseEntity.ok().body(u);
    }
}
