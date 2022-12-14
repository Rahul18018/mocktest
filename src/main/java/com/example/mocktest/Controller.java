package com.example.mocktest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/get_author")

    public List<Author> getAuthor (){
        List<Author> listOfAuthors = new ArrayList<>();
        for()
    }

}
