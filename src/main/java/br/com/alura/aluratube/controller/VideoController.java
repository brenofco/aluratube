package br.com.alura.aluratube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/videos")
public class VideoController {

    @GetMapping("")
    public String carregaVideo() {
        return "/videos/videos";
    }

}
