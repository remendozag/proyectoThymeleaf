
package com.example.ProyectoThymeleaf2;

import com.example.ProyectoThymeleaf2.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class InicioController {
    @Value("${index.despedida}")
    private String despedida;
    @GetMapping("/")
    public String inicio(Model model)
    {
        var mensaje="Saludo Cordial a Mision TIC 2022";
        var persona=new Persona();
        log.info("Ejecutando Controller MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("despedida", despedida);
        return "index";
    }

}
