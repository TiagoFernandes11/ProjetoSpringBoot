package br.edu.criandoapi.projeto.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.criandoapi.projeto.DAO.IUsuario;
import br.edu.criandoapi.projeto.model.Usuario;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) dao.findAll();
    }
}
