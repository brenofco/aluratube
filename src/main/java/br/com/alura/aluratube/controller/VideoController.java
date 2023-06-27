package br.com.alura.aluratube.controller;

import br.com.alura.aluratube.domain.video.DadosCadastroVideo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/videos")
public class VideoController {

    @GetMapping("")
    public String carregaVideo() {
        return "/videos/videos";
    }

    @PostMapping("")
    public String cadastraVideo(DadosCadastroVideo dados) {
        System.out.println(dados);
        return "/videos/videos";
    }


}
