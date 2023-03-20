package br.edu.criandoapi.projeto.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.criandoapi.projeto.DAO.IUsuario;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public String texto() {
        return dao.toString();
    }
}
