package br.com.alura.aluratube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotação em cima da classe "RestController" informa ao Spring que essa classe é uma Controller
//anotação em cima da classe "RequestMapping" mapeia o endpoint que a requisição vai atender
@RestController
@RequestMapping("/hello")
public class HelloController {

    //anotação "GetMapping" em cima do método e dentro da "RequestMapping" - retorna o método para requisição do tipo Get
    @GetMapping
    public String olaMundo() {
        return "Hello World";
    }
}

