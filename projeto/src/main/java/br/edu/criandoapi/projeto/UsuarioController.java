package br.edu.criandoapi.projeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public String texto() {
        return "Hello World!";
    }
}