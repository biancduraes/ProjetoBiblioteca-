package org.example;

import org.example.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    public String inicio(Model model) {

        Livro livro = new Livro();

        livro.setTitulo("O atlas esmeralda");
        livro.setAutor("John Stephens");
        livro.setIsbn("978-85-00-00000-0");

        model.addAttribute("livro", livro);

        return "livros/inicio";
    }
}