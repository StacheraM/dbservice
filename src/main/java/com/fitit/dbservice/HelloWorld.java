package com.fitit.dbservice;

import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

//MONGO niralacyjna baza danych
@RestController
//@Repository klasa odpowiadajaca za komunikacja z baza danych
//interakcja aplikaja uzytkownik aplikacja aplikacja
public class HelloWorld {
@RequestMapping("/")
    public String index(){
        return "Hello world";
    }

}
