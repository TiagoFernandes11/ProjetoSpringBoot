package br.edu.criandoapi.projeto.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import br.edu.criandoapi.projeto.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
