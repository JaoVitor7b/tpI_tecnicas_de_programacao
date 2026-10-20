package br.com.spring.exemplo2_model_atributos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("mensagem", "Testando o envio de dados");
        model.addAttribute("ano", 2026);
        return "index";
    }
}
