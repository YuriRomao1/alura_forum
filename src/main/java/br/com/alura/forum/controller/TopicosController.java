package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDTO> lista(){
        var topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));

        return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
    }
}
