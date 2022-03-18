package com.example.hola.demo.hola.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloController {

@GetMapping(value = "/hello", produces = "text/html")
    public String hello (){
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body>\n" + "<h1>Hello lamon</h1>\n" + "</body>\n" + "</html>";
    }







}
