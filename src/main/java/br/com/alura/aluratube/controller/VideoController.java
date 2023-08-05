package br.com.alura.aluratube.controller;

import br.com.alura.aluratube.domain.video.DataCreateVideo;
import br.com.alura.aluratube.domain.video.Video;
import br.com.alura.aluratube.domain.video.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoRepository repository;

    @GetMapping
    public String loadVideos(){
        return "Hello";
    }

    @PostMapping
    @Transactional
    public void createVideo(@RequestBody DataCreateVideo data) {
        repository.save(new Video(data));
        System.out.println(data);
        System.out.println("Deu certo!");
    }

    @PutMapping
    public String carrega(){
        return "asdfasdf";
    }

    @DeleteMapping
    public String asdf(){
        return "çlkj";
    }
}
